package Apache.OperationsJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class ReadExcel {
	static File f;
	static FileInputStream fis;
	static HSSFWorkbook wb;
	static HSSFSheet sh;
	static HSSFRow rw,rw1;
	static HSSFCell cell,cell1,cell2,cell3,cell4,cell5;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Read data from Excel
		 * Display all data from excel file and print it in console
		 * =========================================================
		 * file
		 * fileInputStream
		 * ------------------------
		 *Get a workbook -- HSSFWorkbook
		 *Get a sheet ---HSSFSheet
		 *Get a row ----HSSFRow
		 *Get a cell ---- HSSFcell
		 *
		 */
		f= new File(System.getProperty("user.dir")+"//TestData//Employee.xls");
		fis= new FileInputStream(f);
		wb= new HSSFWorkbook(fis);  // to call the value from workbook
		sh= wb.getSheet("Employeedetails"); // getting the sheet using wb method dont give space in sheet name
		rw= sh.getRow(0);
		rw1= sh.getRow(1);

		
		cell= rw.getCell(0);
		cell1=rw.getCell(1);
		cell2=rw.getCell(2);
		cell3=rw1.getCell(0);
		cell4=rw1.getCell(1);
		cell5=rw1.getCell(2);



		System.out.println(cell.getStringCellValue());
		System.out.println(cell1.getStringCellValue());
		System.out.println(cell2.getStringCellValue());
		System.out.println(cell3.getStringCellValue());
		System.out.println(cell4.getStringCellValue());
		System.out.println(cell5.getStringCellValue());





		
		
		
		
		
		

	}

}
