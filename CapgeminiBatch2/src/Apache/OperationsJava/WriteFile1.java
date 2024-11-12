package Apache.OperationsJava;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class WriteFile1 {
	static HSSFCell cell,cell1,cell2,cell3,cell4,cell5;
	static HSSFRow rw,rw1;
	static HSSFSheet sh;
	static HSSFWorkbook wb;
	public static void main(String[] args) throws IOException {
		
		// TODO Auto-generated method stub
		File f= new File(System.getProperty("user.dir")+"//TestData//Employee.xls");
		wb= new HSSFWorkbook();
		sh= wb.createSheet("Employeedetails");
		rw= sh.createRow(0);
		rw1= sh.createRow(1);

		cell= rw.createCell(0);
		cell1= rw.createCell(1);
		cell2= rw.createCell(2);
		
		cell3= rw1.createCell(0);
		cell4= rw1.createCell(1);
		cell5= rw1.createCell(2);
		
		cell.setCellValue("ID");
		cell1.setCellValue("NAME");
		cell2.setCellValue("CITY");
		
		cell3.setCellValue("101");
		cell4.setCellValue("Vijay");
		cell5.setCellValue("Pune");
		
		
		FileOutputStream fos= new FileOutputStream(f);
		wb.write(fos);
		System.out.println("excel updated successfully");



		

		
		

	}

}
