package com.selenium;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataByIndex {
	public static void readdata() throws Exception {
		String path="D:\\library\\eclipse\\workspace\\realtimeproject\\Book3.xlsx";
		FileInputStream fi=new FileInputStream(path);
		XSSFWorkbook w= new XSSFWorkbook(fi);
		XSSFSheet s=w.getSheet("sheet1");
		XSSFRow r=null;
		XSSFCell c=null;
		r=s.createRow(3);
		if(r==null);
		r=s.createRow(5);
		c=r.createCell(4);
		if(c==null);
		c=r.createCell(3);
		c.setCellValue("gnesh");
		FileOutputStream fo=new FileOutputStream("D:\\library\\eclipse\\workspace\\realtimeproject\\Book3.xlsx");
		w.write(fo);
		w.close();
		fo.close();
		
		
	}

	public static void main(String[] args) throws Exception {
		readdata();
		System.out.println("cellvalie");
		

	}

}
