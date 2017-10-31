package top.zywork.common;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import top.zywork.enums.MIMETypeEnum;

/**
 * Excel工具测试类<br />
 * 创建于2017-10-31
 *
 * @author 王振宇
 */
public class ExcelUtilsTest {

    @Test
    public void readExcel() {
        ExcelUtils excelUtils = new ExcelUtils();
        Workbook workbook = excelUtils.readExcel(ExcelUtils.class.getResourceAsStream("/excel/excel_test.xlsx"), MIMETypeEnum.XLSX);
        Sheet sheet = workbook.getSheetAt(0);
        System.out.println(excelUtils.getStringCellValueAt(sheet, 0, 0));
        excelUtils.close();
    }

    @Test
    public void writeExcel() {
        ExcelUtils excelUtils = new ExcelUtils();
        Workbook workbook = excelUtils.newExcel(MIMETypeEnum.XLSX);
        Sheet sheet = workbook.createSheet();
        sheet.createRow(5).createCell(5);
        excelUtils.setStringCellValueAt(sheet, 5, 5, "test");
        excelUtils.insertPicture(sheet, ExcelUtils.class.getResourceAsStream("/excel/idea.png"), MIMETypeEnum.PNG,
                0, 0, 100, 100, 5, 5, 6, 6);
        excelUtils.writeExcel("test.xlsx");
        excelUtils.close();
    }

}
