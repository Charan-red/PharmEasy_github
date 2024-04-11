package capstone.pharmeasy.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XLUtility {
	
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook workbook;
	public XSSFSheet sheet;
	public XSSFRow row;
	public XSSFCell cell;
	public CellStyle style;   
	String path;
	

	XSSFWorkbook work_book;
	XSSFSheet sheet1;
	public  XLUtility(String excelfilePath) {
	try {
	File s = new File(excelfilePath);
	FileInputStream stream = new FileInputStream(s);
	work_book = new XSSFWorkbook(stream);
	}
	catch(Exception e) {
	System.out.println(e.getMessage());
	}
	}
	public String getData(int sheetnumber, int row, int column){
	sheet = work_book.getSheetAt(sheetnumber);
	String data = sheet.getRow(row).getCell(column).getStringCellValue();
	return data;
	} 
	public int getRowCount(int sheetIndex){
	int row = work_book.getSheetAt(sheetIndex).getLastRowNum();
	row = row + 1;
	return row;

}

}
