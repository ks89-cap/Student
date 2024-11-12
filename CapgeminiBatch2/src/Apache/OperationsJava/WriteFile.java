package Apache.OperationsJava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteFile {
	static File f;  //its not going to change,therefore its static
	static HSSFWorkbook wb;
	static HSSFSheet sheet;
	static HSSFRow row;
	static HSSFCell cell,cell1,cell2;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 *HSSF API
		 *============
		 *create a workbook -- HSSFWorkbook
		 *create a sheet ---HSSFSheet
		 *create a row ----HSSFRow
		 *create a cell ---- HSSFcell
		 */
		  f= new File(System.getProperty("user.dir")+"//TestData//Capgemini.xls");
		wb= new HSSFWorkbook();
		sheet= wb.createSheet("LoginCredentials");
	
	
		//System.out.println("name of the sheet: "+ sheet.getSheetName());
		//create a row and cell
		 row=sheet.createRow(0);
		 cell= row.createCell(0);
		 cell1= row.createCell(1);
		 cell2= row.createCell(2);

		 //set inputs in cell 0,1,2 and row0
		 cell.setCellValue("kp@gmail.com");
		 cell1.setCellValue("799498****");
		 cell2.setCellValue("Bangalore");


		 
		 
		 
			FileOutputStream fos= new FileOutputStream(f);
			wb.write(fos);
			System.out.println("data is returned");
			//System.out.println("file created");

	}

}
