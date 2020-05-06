package com.syntax.class32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Task01 {

	public static void main(String[] args) throws IOException {
         String filePath="C:\\Users\\mirzo\\eclipse-workspace\\JavaBasics\\Datas\\Task01.xlsx";
		
		FileInputStream fis=new FileInputStream(filePath);
		
		Workbook wbook= new XSSFWorkbook(fis);
		
		Sheet sheet=wbook.getSheet("Sheet1");
		
		int rows=sheet.getPhysicalNumberOfRows();
		System.out.println(rows);
		int cols=sheet.getRow(0).getLastCellNum();
		System.out.println(cols);
		
		for(int r=0; r<rows; r++) {
			for(int c=0; c<cols-1; c++) {
			 String val=sheet.getRow(r).getCell(c).toString();
				System.out.print( val+ " ");
			}
			System.out.println();
		}
		

	}

}
