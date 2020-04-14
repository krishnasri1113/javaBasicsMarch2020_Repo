package FileHandling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritedataintoExcel {

	public static void main(String[] args) {
String spath=System.getProperty("user.dir")+"\\src\\FileHandling\\WriteintoExcel.xls";
		try {
			FileOutputStream fos=new FileOutputStream(spath);
			HSSFWorkbook myExcelBook = new HSSFWorkbook();
			HSSFSheet myExcleSheet = myExcelBook.createSheet("studentinfo");
			Row row=myExcleSheet.createRow(0);
			Cell name=row.createCell(0);
			name.setCellValue("siri");
			myExcleSheet.autoSizeColumn(1);
			myExcelBook.close();
      System.out.println("Done");
		
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	}
	
	
		
