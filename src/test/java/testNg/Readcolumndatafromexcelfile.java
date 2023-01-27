package testNg;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class Readcolumndatafromexcelfile {
	public FileInputStream fi;
	public XSSFWorkbook w;
	public XSSFSheet s;
	public XSSFRow r;
	public XSSFCell c;
	
  @Test
  public void f() throws Exception {
	  fi=new FileInputStream("D:\\library\\eclipse\\workspace\\realtimeproject\\Book3.xlsx");
	  w=new XSSFWorkbook(fi);
	  s=w.getSheet("sheet1");
	  r=s.getRow(0);
	  int column=-1;
	 for(int i=0;i<r.getLastCellNum();i++) {
		 System.out.println(r.getCell(i).getStringCellValue());
		 if(r.getCell(i).getStringCellValue().equalsIgnoreCase("password")) {
			 column=i;
			 System.out.println(column);
		 }
	 }
  r=s.getRow(3);
  XSSFCell c=r.getCell(column);
 
  
  }
  
  
}
