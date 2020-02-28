package com.company.project.service.impl;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import com.company.project.model.LegButton;
import com.company.project.service.LegButtonService;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

//import com.langsin.mapper.StuMapper;
//import com.langsin.pojo.Stu;
//import com.langsin.pojo.StuExample;


@Service
public class ExcelService {

    @Resource
    private LegButtonService legButtonService;

    public boolean batchImport(String fileName, MultipartFile file) throws Exception {
        boolean notNull = false;    //文件非空判断标记
        List<LegButton> stuList = new ArrayList<>();  //承载Excel文件数据的集合
        /*
         * 判断文件名的合法性
         * 判断文件是2003版or2007版
         */
        String[] fullName = fileName.split("\\.");
        System.out.println(fullName[1]);
        String suffix = fullName[1];
        if (suffix.equals("xls") && suffix.equals("xlsx")) {
            throw new Exception("上传不正确");
        }
        boolean isExcel2003 = true;
        if (suffix.equals("xlsx")) {
            isExcel2003 = false;
        }

        InputStream iStream = file.getInputStream(); //IO流
        Workbook workbook = null; //创建工作簿
        if (isExcel2003) {
            workbook = new HSSFWorkbook(iStream); //2003版
        } else {
            workbook = new XSSFWorkbook(iStream); //2007版
        }

        /*
         * 读取工作簿里的表
         * 检验文件是否为空
         */
        Sheet sheet = workbook.getSheetAt(0);
        if (sheet != null) {
            notNull = true;
        }
        /*
         * 读取表里的数据行
         */
        for (int r = 1; r <= sheet.getLastRowNum(); r++) { //r=1是从第二行开始读数据
            Row row = sheet.getRow(r); //读行
            if (row == null) { //规避空行
                continue;
            }

            LegButton student = new LegButton(); //行数据对象

            /*
             * 获取整行信息
             */
            row.getCell(0).setCellType(Cell.CELL_TYPE_STRING);
            String studentId = row.getCell(0).getStringCellValue();
            if (studentId == null || studentId.isEmpty()) {  //确保主键对应的信息不为空
                throw new Exception("导入失败，第" + (r + 1) + "行，编号未填写");
            }
            row.getCell(1).setCellType(Cell.CELL_TYPE_STRING);
            row.getCell(2).setCellType(Cell.CELL_TYPE_STRING);
//            row.getCell(3).setCellType(Cell.CELL_TYPE_STRING);
//            row.getCell(4).setCellType(Cell.CELL_TYPE_STRING);
//            row.getCell(5).setCellType(Cell.CELL_TYPE_STRING);
//            row.getCell(6).setCellType(Cell.CELL_TYPE_STRING);
//            row.getCell(7).setCellType(Cell.CELL_TYPE_STRING);
            String studentUnid = row.getCell(1).getStringCellValue();
            String studentName = row.getCell(2).getStringCellValue();

            /*
             * 填充信息到行数据对象
             */
//            student.setUnid(studentUnid);
            student.setName(studentName);
            stuList.add(student); //行数据对象存入Excel数据集合
        }

        for (LegButton stu : stuList) {
            /*
             * 判断数据库里有无Excel表数据
             * 无--->插入操作
             * 有--->更新操作
             */
            String stuId = stu.getUnid();
//            LegButton example = new LegButton();
////            example.createCriteria().andSidEqualTo(stuId);
////            example.
////            example.createCriteria().andSidEqualTo(stuId);
            List<LegButton> stuInfo = legButtonService.findAll();
            int result = stuInfo.size();
            if (result == 0) {  //
                legButtonService.save(stu);
                System.out.println("插入" + stu);
            } else {
                legButtonService.update(stu);
                System.out.println("更新" + stu);
            }
        }

        return notNull;

    }

}
