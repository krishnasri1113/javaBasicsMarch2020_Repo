package FileHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
public class ReadtheExceldata {
public static void main(String[] args)  {
		String spath=System.getProperty("user.dir")+"\\src\\FileHandling\\Exceldata.xls";
		try {
		FileInputStream fis=new FileInputStream(spath);
		HSSFWorkbook myExcelBook = new HSSFWorkbook(fis);
		HSSFSheet myExcleSheet = myExcelBook.getSheet("studentinfo");
		HSSFRow row1 = myExcleSheet.getRow(0);
		System.out.println(row1.getCell(0).getStringCellValue());
		System.out.println(row1.getCell(1).getNumericCellValue());
		System.out.println(row1.getCell(2).getStringCellValue());
		HSSFRow row2 = myExcleSheet.getRow(1);
		System.out.println(row2.getCell(0).getStringCellValue());
		System.out.println(row2.getCell(1).getNumericCellValue());
		System.out.println(row2.getCell(2).getStringCellValue());
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}





}
