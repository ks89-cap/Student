package Apache.OperationsJava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadandWrite {
	static File f;
	static FileOutputStream fos;
	static XSSFWorkbook wb;
	static XSSFSheet sh;
	static XSSFRow rw,rw1,rw2;
	static XSSFCell cell,cell1,cell2;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * XSSF API
		 * Perform reading and writing operation over the excel file which is having format .xslx
		 * ======================================================================================
		 * Operations
		 * 
		 * -create an excel fie .xlsx file
		 * -write the data in the file
		 * -display or read data from the created excel file
		 * =================================================
		 * FILE
		 * FILEOUTPUTSTREAM
		 * ================================================
		 * create a workbook ---XSSFWorkBook
		 * create a sheet  ---XSSFSheet
		 * create a row      ---XSSFRow
		 * create a cell    ----XSSFCell
		 * 
		 */
		f= new File(System.getProperty("user.dir")+"//TestData//Department.xlsx");
		System.out.println("file is created");
		wb= new XSSFWorkbook();
		sh= wb.createSheet("DepartmentNames");
		
		rw=sh.createRow(0);
		cell=rw.createCell(0);
		cell.setCellValue("IT");
		
		
		rw1=sh.createRow(1);
		cell=rw1.createCell(0);
		cell.setCellValue("Finance");                            //same cell but different rows

		rw2=sh.createRow(2);
		cell=rw2.createCell(0);
		cell.setCellValue("HR");
		
		
		
		fos= new FileOutputStream(f);
		wb.write(fos);
		System.out.println("data is filled");
		fos.close();
		wb.close();
		
		

	}

}
