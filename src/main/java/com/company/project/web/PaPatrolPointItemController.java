package com.company.project.web;

import com.company.project.configurer.DomainedResource;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PaPatrolPointItem;
import com.company.project.model.PaPatrolPointItemView;
import com.company.project.model.PaTaskItem;
import com.company.project.model.PaTaskItemPointItemMap;
import com.company.project.service.PaPatrolPointItemService;
import com.company.project.service.PaPatrolPointItemViewService;
import com.company.project.service.PaTaskItemPointItemMapService;
import com.company.project.service.PaTaskItemService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;
import tk.mybatis.mapper.entity.Condition;
import tk.mybatis.mapper.entity.Example;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * 巡检项目和巡检项目批量完成
 * Created by CodeGenerator on 2020/03/09.
 */
@RestController
@RequestMapping("/papatrolpointitem")
public class PaPatrolPointItemController extends DomainedResource {
    @Resource
    private PaPatrolPointItemService paPatrolPointItemService;

    @Resource
    private PaTaskItemService paTaskItemService;


    @Resource
    private PaPatrolPointItemViewService paPatrolPointItemViewService;
    /**
     * 巡检任务和点位关联表
     */
    @Resource
    private PaTaskItemPointItemMapService paTaskItemPointItemMapService;


    @PostMapping("/add")
    public Result add(PaPatrolPointItem paPatrolPointItem) {
        paPatrolPointItemService.save(paPatrolPointItem);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/{unid}")
    public Result delete(@PathVariable String unid) {
        PaPatrolPointItem paPatrolPointItem = paPatrolPointItemService.findById(unid);
        paPatrolPointItem.setFlagDel(true);
        paPatrolPointItemService.update(paPatrolPointItem);
        return ResultGenerator.genSuccessResult(paPatrolPointItem);
    }

    /**
     * 巡检项目状态批量修改-并且修改项目完成状态
     *
     * @param list
     * @param unid
     * @return
     */
    @PutMapping("/list/update/{unid}")
    public Result listUpdate(@RequestBody List<PaPatrolPointItem> list, @PathVariable String unid) {
        try {
            paPatrolPointItemService.updatePoint(list);
            PaTaskItem paTaskItem = paTaskItemService.findById(unid);
            paTaskItem.setStatus(2);
            paTaskItemService.update(paTaskItem);
            PaTaskItemPointItemMap pointItemMap = paTaskItemPointItemMapService.findById(unid);
            pointItemMap.setStatus(2);
            paTaskItemPointItemMapService.update(pointItemMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(PaPatrolPointItem paPatrolPointItem) {
        paPatrolPointItemService.update(paPatrolPointItem);
        return ResultGenerator.genSuccessResult();
    }


    @GetMapping("/{unid}")
    public Result detail(@PathVariable String unid) {
        PaPatrolPointItem paPatrolPointItem = paPatrolPointItemService.findById(unid);
        return ResultGenerator.genSuccessResult(paPatrolPointItem);
    }

//     @GetMapping("/list")
//     public Result list(HttpServletRequest request,@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
//        String temp = this.tokenValue(request);
//         PageHelper.startPage(page, size);
//         List<PaPatrolPointItem> list = null;
//         Condition condition = new Condition(PaPatrolPointItem.class);
//         Example.Criteria cr= condition.createCriteria();
//         list = paPatrolPointItemService.findByCondition(condition);
//         PageInfo pageInfo = new PageInfo(list);
//         return ResultGenerator.genSuccessResult(pageInfo);
//
//     }

    @GetMapping("/list")
    public Result listView(HttpServletRequest request, @RequestParam(required = false) String domainUnid, @RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size,
                           @RequestParam(required = false) String unid, @RequestParam(required = false) String itemUnid, @RequestParam(required = false) String name) {
        String temp = this.tokenValue(request, domainUnid);
        PageHelper.startPage(page, size);
        List<PaPatrolPointItemView> list = null;
        Condition condition = new Condition(PaPatrolPointItemView.class);
        Example.Criteria cr = condition.createCriteria();
        if (name != null && name != "") {
            cr.andCondition("name like'%" + name + "%'");
        }
        if (unid != null) {
            cr.andCondition("patrol_point_unid='" + unid + "'");
        }
        if (itemUnid != null) {
            cr.andCondition("unid='" + itemUnid + "'");
        }
        cr.andCondition(temp).andCondition("flag_del=0");
        list = paPatrolPointItemViewService.findByCondition(condition);
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);

    }


}
