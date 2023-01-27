package com.selenium;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readdatafromexcel {
	public static void readdata() throws Exception {
	 String path="D:\\library\\eclipse\\workspace\\realtimeproject\\Book3.xlsx";
	 FileInputStream fi=new FileInputStream(path);
	 XSSFWorkbook w=new XSSFWorkbook(fi);
	 XSSFSheet s=w.getSheet("sheet1");
	 XSSFRow r=s.getRow(2);
	 XSSFCell c=r.getCell(0);
	 System.out.println(c.getStringCellValue());
	 w.close();
	}


	public static void main(String[] args) throws Exception {
         readdata();
         System.out.println();
	
	}

}
