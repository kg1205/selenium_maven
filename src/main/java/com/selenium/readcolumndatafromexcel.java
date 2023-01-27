package com.selenium;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readcolumndatafromexcel {

	public static void main(String[] args) throws Exception {
		String path="D:\\library\\eclipse\\workspace\\realtimeproject\\Book3.xlsx";
		FileInputStream fi= new FileInputStream(path);
		XSSFWorkbook w=new XSSFWorkbook(fi);
		XSSFSheet s=w.getSheet("sheet1");
		XSSFRow r=s.getRow(0);
		int column=-1;
		for(int i=0 ;i<r.getLastCellNum();i++) {
			System.out.println(r.getCell(i).getStringCellValue());
			if(r.getCell(i).getStringCellValue().equalsIgnoreCase("password")) {
				column=i;
				System.out.println(column);
			}
		}
		r=s.getRow(4);
		XSSFCell c=r.getCell(column);
		System.out.println(c.getStringCellValue());
          w.close();
	}

}
