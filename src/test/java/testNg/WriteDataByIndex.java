package testNg;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class WriteDataByIndex {
	public FileInputStream fi;
	public FileOutputStream fo;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow r;
	public XSSFCell c;
	
  @Test
  public void f() throws Exception {
	  fi=new FileInputStream("D:\\library\\eclipse\\workspace\\realtimeproject\\Book3.xlsx");
	  w=new XSSFWorkbook(fi);
	  s=w.getSheet("sheet1");
	  r=null;
	  c=null;
	  r=s.getRow(2);
	  if(r==null);
	  r=s.createRow(2);
	  c=r.getCell(2);
	  if(c==null);
	  c=r.createCell(2);
	  c.setCellValue("passed");
	  fo=new FileOutputStream("D:\\library\\eclipse\\workspace\\realtimeproject\\Book3.xlsx");
	  w.write(fo);
	  fo.close();
  }
}
