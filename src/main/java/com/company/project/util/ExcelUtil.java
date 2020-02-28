package com.company.project.util;


import com.alibaba.fastjson.JSON;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.tomcat.util.http.fileupload.IOUtils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 解析EXCEL
 */
public class ExcelUtil {


    private final static String excel2003L = ".xls"; // 2003- 版本的excel
    private final static String excel2007U = ".xlsx"; // 2007+ 版本的excel

    /**
     * 导出Excel
     *
     * @param sheetName sheet名称
     * @param title     标题
     * @param values    内容
     * @param wb        HSSFWorkbook对象
     * @return
     */
    public static HSSFWorkbook getHSSFWorkbook(String sheetName, String[] title, String[][] values, HSSFWorkbook wb) {

        // 第一步，创建一个HSSFWorkbook，对应一个Excel文件
        if (wb == null) {
            wb = new HSSFWorkbook();
        }

        // 第二步，在workbook中添加一个sheet,对应Excel文件中的sheet
        HSSFSheet sheet = wb.createSheet(sheetName);

        // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制
        HSSFRow row = sheet.createRow(0);

        // 第四步，创建单元格，并设置值表头 设置表头居中
        HSSFCellStyle style = wb.createCellStyle();
        style.setAlignment(HSSFCellStyle.ALIGN_CENTER); // 创建一个居中格式

        // 声明列对象
        HSSFCell cell = null;

        // 创建标题
        for (int i = 0; i < title.length; i++) {
            cell = row.createCell(i);
            cell.setCellValue(title[i]);
            cell.setCellStyle(style);
        }

        // 创建内容
        for (int i = 0; i < values.length; i++) {
            row = sheet.createRow(i + 1);
            if (values[i] != null) {
                for (int j = 0; j < values[i].length; j++) {
                    // 将内容按顺序赋给对应的列对象
                    row.createCell(j).setCellValue(values[i][j]);
                }
            } else {
                continue;
            }

        }
        return wb;
    }

    public static void saveExcel(String srcPath, HSSFWorkbook workbook) {

        FileOutputStream fos = null;
        try {
            File file = new File(srcPath);
            fos = new FileOutputStream(file);
            workbook.write(fos);// 写文件
        } catch (Exception e) {
            // logger.error("LassenMaintenanceRpc derivedDataToExcel error：", e);

        } finally {
            IOUtils.closeQuietly(fos);

        }

    }

    /**
     * 将流中的Excel数据转成List<Map>(读取Excel)
     *
     * @param in       输入流
     * @param fileName 文件名（判断Excel版本）
     * @param mapping  字段名称映射
     * @return
     * @throws Exception
     */
    public static List<Map<String, Object>> readExcel(InputStream in, String fileName, Map<String, String> mapping)
            throws Exception {
        // 根据文件名来创建Excel工作薄
        Workbook work = getWorkbook(in, fileName);
        if (null == work) {
            throw new Exception("创建Excel工作薄为空！");
        }
        Sheet sheet = null;
        Row row = null;
        Cell cell = null;
        // 返回数据
        List<Map<String, Object>> ls = new ArrayList<Map<String, Object>>();

        // 遍历Excel中所有的sheet
        for (int i = 0; i < work.getNumberOfSheets(); i++) {
            sheet = work.getSheetAt(i);
            if (sheet == null)
                continue;

            // 取第一行标题
            row = sheet.getRow(0);
            String title[] = null;
            if (row != null) {
                title = new String[row.getLastCellNum()];

                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    title[y] = (String) getCellValue(cell);
                }

            } else
                continue;

            // 遍历当前sheet中的所有行
            for (int j = 1; j < sheet.getLastRowNum() + 1; j++) {
                row = sheet.getRow(j);
                Map<String, Object> m = new HashMap<String, Object>();
                // 遍历所有的列
                for (int y = row.getFirstCellNum(); y < row.getLastCellNum(); y++) {
                    cell = row.getCell(y);
                    String key = title[y];
                    // log.info(JSON.toJSONString(key));
                    m.put(mapping.get(key), getCellValue(cell));
                }
                ls.add(m);
            }

        }
        // work.close();
        return ls;
    }

    /**
     * 描述：根据文件后缀，自适应上传文件的版本
     *
     * @param inStr ,fileName
     * @return
     * @throws Exception
     */
    public static Workbook getWorkbook(InputStream inStr, String fileName) throws Exception {
        Workbook wb = null;
        String fileType = fileName.substring(fileName.lastIndexOf("."));
        if (excel2003L.equals(fileType)) {
            wb = new HSSFWorkbook(inStr); // 2003-
        } else if (excel2007U.equals(fileType)) {
            wb = new XSSFWorkbook(inStr); // 2007+
        } else {
            throw new Exception("解析的文件格式有误！");
        }
        return wb;
    }

    /**
     * 描述：对表格中数值进行格式化
     *
     * @param cell
     * @return
     */
    public static Object getCellValue(Cell cell) {
        Object value = null;
        DecimalFormat df = new DecimalFormat("0"); // 格式化number String字符
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd"); // 日期格式化
        DecimalFormat df2 = new DecimalFormat("0"); // 格式化数字

        switch (cell.getCellType()) {
            case Cell.CELL_TYPE_STRING:
                value = cell.getRichStringCellValue().getString();
                break;
            case Cell.CELL_TYPE_NUMERIC:
                if ("General".equals(cell.getCellStyle().getDataFormatString())) {
                    value = df.format(cell.getNumericCellValue());
                } else if ("m/d/yy".equals(cell.getCellStyle().getDataFormatString())) {
                    value = sdf.format(cell.getDateCellValue());
                } else {
                    value = df2.format(cell.getNumericCellValue());
                }
                break;
            case Cell.CELL_TYPE_BOOLEAN:
                value = cell.getBooleanCellValue();
                break;
            case Cell.CELL_TYPE_BLANK:
                value = "";
                break;
            default:
                break;
        }
        return value;
    }

//    public static void main(String[] args) throws Exception {
//
//        String path = new File(".").getCanonicalPath() + "/studn.xlsx";
//        File file = new File(path);
//        FileInputStream fis = new FileInputStream(file);
//        Map<String, String> m = new HashMap<String, String>();
//        m.put("id", "id");
//        m.put("姓名", "name");
//        m.put("年龄", "age");
//        List<Map<String, Object>> ls = readExcel(fis, file.getName(), m);
//
//
//        System.out.println(JSON.toJSONString(ls));
//        //检查修改
//        ls.forEach(item -> {
//            item.put("error", "名称不存在");
//
//        });
//
//        //保存
//        String[] title = {"id", "姓名", "年龄", "备注"};
//
//        // excel文件名
//        String fileName = new File(".").getCanonicalPath() + "/维护单表" + System.currentTimeMillis() + ".xls";
//
//        // sheet名
//        String sheetName = "维护单表";
//        String[][] content = new String[ls.size()][];
//        for (int i = 0; i < ls.size(); i++) {
//            content[i] = new String[title.length];
//            Map<String, Object> obj = ls.get(i);
//            content[i][0] = obj.get("id") == null ? "" : obj.get("id").toString();
//            content[i][1] = obj.get("name") == null ? "" : obj.get("name").toString();
//            content[i][2] = obj.get("age") == null ? "" : obj.get("age").toString();
//            content[i][3] = obj.get("error") == null ? "" : obj.get("error").toString();
//        }
//        // 创建HSSFWorkbook
//        HSSFWorkbook wb = ExcelUtil.getHSSFWorkbook(sheetName, title, content, null);
//        saveExcel(fileName, wb);
//    }


}
