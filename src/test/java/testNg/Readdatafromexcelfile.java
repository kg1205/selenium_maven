package testNg;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
public class Readdatafromexcelfile {
	FileInputStream fi;
	XSSFWorkbook wb;
	XSSFSheet sh;
	XSSFRow r;
	XSSFCell c;
	
	
  @Test
  public void f() throws IOException  {
	  File f = new File("D:\\library\\eclipse\\workspace\\realtimeproject\\Book1.xlsx");
	  fi=new FileInputStream(f);
	  wb=new XSSFWorkbook(fi);
	  sh=wb.getSheet("sheet1");
	  r=sh.getRow(3);
	  c=r.getCell(1);
	  System.out.println(c.getStringCellValue());
  }
}
