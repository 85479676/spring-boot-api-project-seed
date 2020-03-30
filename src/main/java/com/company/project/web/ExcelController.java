package com.company.project.web;


import com.alibaba.fastjson.JSON;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.LegUserGroup;
import com.company.project.model.OauDomain;
import com.company.project.model.OauOpenId;
import com.company.project.service.LegUserGroupService;
import com.company.project.service.OauDomainService;
import com.company.project.service.OauOpenIdService;
import com.company.project.util.ExcelUtil;
import com.company.project.util.MD5Util;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * EXCEL表格批量插入 应用版本
 */
@RestController
public class ExcelController {
    private final Logger logger = LoggerFactory.getLogger(ExcelController.class);

    @Resource
    private OauOpenIdService service;
    @Resource
    private OauDomainService domainService;
    @Resource
    private LegUserGroupService groupService;

    @SuppressWarnings("rawtypes")
    @ResponseBody
    @PostMapping(value = "uploadExcel", produces = "text/plain;charset=UTF-8")
    public Result<String> uploadExcel(@RequestParam("fileName") MultipartFile file) {

        List<Map<String, Object>> list = new ArrayList<Map<String, Object>>();
        try {
            String fileName = file.getOriginalFilename();
            // 加个时间戳，尽量避免文件名称重复
            String path = new File(".").getCanonicalPath() + "/"
                    + new SimpleDateFormat("yyyyMMddHHmmss").format(new Date()) + "_" + fileName;
            System.out.println(path);
            File dest = new File(path);
            file.transferTo(dest); // 保存文件
            FileInputStream fis = new FileInputStream(dest);
            // 将multipartFile转为inputstream
            Map<String, String> titleMap = new HashMap<>();
            titleMap.put("用户名", "NAME");
            titleMap.put("密码", "SALT");
            titleMap.put("分组名称", "DOMAIN_UNID");
            titleMap.put("用户组名称", "USER_GROUP_UNID");
            list = ExcelUtil.readExcel(fis, fileName, titleMap);
            logger.error(list.toString());
            dest.delete();

            Boolean isTrue = true;
            // 判断数据正确
            // TODO
            for (Map<String, Object> legbut : list) {

                OauOpenId openId = new OauOpenId();
                openId.setNameLogin(legbut.get("NAME").toString());
                String md5 = MD5Util.encode(legbut.get("SALT").toString());
                openId.setSalt(md5);
                OauDomain domain = domainService.selectName(legbut.get("DOMAIN_UNID").toString());
                openId.setDomainUnid(domain.getUnid());
                LegUserGroup userGroup = groupService.selectByName(legbut.get("USER_GROUP_UNID").toString());
                openId.setUserGroupUnid(userGroup.getUnid());
                service.save(openId);
            }
            if (isTrue) {
                return ResultGenerator.genSuccessResult("添加成功!!!");
            } else {
                // 不正确
                list.forEach(item -> {
                    item.put("error", "名称不存在");
                });
                // 保存
                String[] title = {"id", "姓名", "年龄", "备注"};
                // excel文件名
                String fileName_new = new File(".").getCanonicalPath() + "/维护单表" + System.currentTimeMillis() + ".xls";
                // sheet名
                String sheetName = "维护单表";
                String[][] content = new String[list.size()][];
                for (int i = 0; i < list.size(); i++) {
                    content[i] = new String[title.length];
                    Map<String, Object> obj = list.get(i);
                    content[i][0] = obj.get("id") == null ? "" : obj.get("id").toString();
                    content[i][1] = obj.get("name") == null ? "" : obj.get("name").toString();
                    content[i][2] = obj.get("age") == null ? "" : obj.get("age").toString();
                    content[i][3] = obj.get("error") == null ? "" : obj.get("error").toString();
                }
                // 创建HSSFWorkbook
                HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);
                ExcelUtil.saveExcel(fileName_new, wb);
                return ResultGenerator.genSuccessResult(fileName);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(JSON.toJSONString(list));
        return ResultGenerator.genSuccessResult("Sucess");
    }
    /**
     * 导出报表
     *
     * @return
     */
    @GetMapping(value = "/export")
    public void exportRepairOrder(@RequestParam("filename") String filename, HttpServletRequest req,
                                  HttpServletResponse response) throws Exception {

        // excel文件名
        String fileNameE = "用户新增" + System.currentTimeMillis() + ".xlsx";
        OutputStream os = null;
        FileInputStream fis = null;
        // 响应到客户端
        try {
            String path = new File("./static").getCanonicalPath() + "/" + filename;
            File file = new File(path);
            fis = new FileInputStream(file);
            this.setResponseHeader(response, fileNameE);
            os = response.getOutputStream();
            // 创建缓冲区
            byte buffer[] = new byte[1024];
            int len = 0;
            // 循环将输入流中的内容读取到缓冲区当中
            while ((len = fis.read(buffer)) > 0) {
                // 输出缓冲区的内容到浏览器，实现文件下载
                os.write(buffer, 0, len);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (os != null) {
                os.flush();
                os.close();
            }
            if (fis != null) {
                fis.close();
            }
        }
    }

    // 发送响应流方法
    public void setResponseHeader(HttpServletResponse response, String fileName) {
        try {
            try {
                fileName = new String(fileName.getBytes(), "ISO8859-1");
            } catch (UnsupportedEncodingException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            response.setContentType("application/octet-stream;charset=ISO8859-1");
            response.setHeader("Content-Disposition", "attachment;filename=" + fileName);
            response.addHeader("Pargam", "no-cache");
            response.addHeader("Cache-Control", "no-cache");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

}
