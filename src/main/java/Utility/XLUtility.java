package Utility;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;

import java.io.FileOutputStream;

public class XLUtility {
    public String getXLSData(String sheet, int row, int cell) throws Exception {
        FileInputStream fis = new FileInputStream("G:\\selenium\\MavenPjt\\Priority\\testData\\ApachePOIDemo.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh  = wb.getSheet(sheet);

        Row rows = sh.getRow(row);
        String cellValue= rows.getCell(cell).toString();
        wb.close();

        return cellValue;
    }

    public int getRowCount(String sheet) throws Exception{
        FileInputStream fis = new FileInputStream("G:\\selenium\\MavenPjt\\Priority\\testData\\ApachePOIDemo.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        Sheet sh  = wb.getSheet(sheet);

        int rowCount = sh.getLastRowNum();
        return rowCount;
    }

    public void setDataIntoExcel(String sheet, int row, int cell, String data) throws Exception{
        FileInputStream fis = new FileInputStream("G:\\selenium\\MavenPjt\\Priority\\testData\\ApachePOIDemo.xlsx");
        Workbook wb = WorkbookFactory.create(fis);
        //to add a data to cell
        wb.getSheet(sheet).getRow(row).getCell(cell).setCellValue(data);

        //to save the data after entering
        FileOutputStream fos = new FileOutputStream("G:\\selenium\\MavenPjt\\Priority\\testData\\ApachePOIDemo.xlsx");
        wb.write(fos);
        wb.close();

    }

}
