package com.company.project.util;


import cn.com.terata.helper.boot.AnaysisPublic;
import com.alibaba.fastjson.JSONObject;
import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LogRaw202002;
import com.company.project.service.LogRaw202002Service;
import com.company.project.service.LogRaw202002ViewService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/facilityData")
public class RedisController extends DomainedResource {

    @Resource
    private LogRaw202002Service logRaw202002Service;


    @Resource
    private LogRaw202002ViewService logService;

    @GetMapping("/{unid}")
    public Result list(@PathVariable(required = true) String unid) {
        Map<String, String> map = RedisSingleton.instance().hgetall(unid);
        System.out.println(map);
        return ResultGenerator.genSuccessResult(map);

    }

    @GetMapping("/raw")
    public Result li(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "200") Integer size, @RequestParam(required = false) String unid,
                     @RequestParam(required = false) String datimeFrom, @RequestParam(required = false) String datimeTo) {
        PageHelper.startPage(page, size);
        if (datimeFrom==null){
            datimeFrom = DateHelper.getDateYYYY_MM_DD_MIN();
        }
        if (datimeTo==null){
            datimeTo = DateHelper.getDateYYYY_MM_DD_MAX();

        }
        LogRaw202002 logRaw = new LogRaw202002();
        AnaysisPublic anaysisPublic = new AnaysisPublic();
        List<LogRaw202002> object = new ArrayList<>();


        Condition condition = new Condition(LogRaw202002.class);
        Example.Criteria cr = condition.createCriteria();
        if (unid != null) {
            cr.andCondition("UNID='" + unid + "'");
        }
        if (datimeFrom != null && datimeFrom != "" && datimeTo != null && datimeTo != "") {
            cr.andCondition("DATIME_SYS BETWEEN'" + datimeFrom + "'").andCondition("'" + datimeTo + "'");
        }
        cr.andCondition("UPORDOWN='up'");

        object = logRaw202002Service.findByCondition(condition);
        for (LogRaw202002 logRawew : object) {


            JSONObject jsonObject = anaysisPublic.anasisy(String.valueOf(logRawew.getOrders()), logRawew.getRaw(), logRawew.getProtocolType());
            logRawew.setValueData(jsonObject.toJSONString());
        }

        PageInfo pageInfo = new PageInfo(object);
        return ResultGenerator.genSuccessResult(pageInfo);
    }


}
