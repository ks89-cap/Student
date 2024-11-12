package Apache.OperationsJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadWrite1 {
	static File f;
	static FileOutputStream fos;
	static FileInputStream fis;
	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	static XSSFRow row,row1,row2,row3,row4;
	static XSSFCell cell;
 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		f=new File(System.getProperty("user.dir")+"//TestData//Languages.xlsx");
		wb=new XSSFWorkbook();
		sheet=wb.createSheet("ListOfProgrammingLanguages");
		//row 1
		row=sheet.createRow(0);
		cell=row.createCell(0);
		cell.setCellValue("Java");
		
		//row 2
		row1=sheet.createRow(1);
		cell=row1.createCell(0);
		cell.setCellValue("Python");
		
		//row3
		row2=sheet.createRow(2);
		cell=row2.createCell(0);
		cell.setCellValue("C#");
		
		//row4
		row3=sheet.createRow(3);
		cell=row3.createCell(0);
		cell.setCellValue("Php");
		
		//row5
		row4=sheet.createRow(4);
		cell=row4.createCell(0);
		cell.setCellValue("VB");
		fos=new FileOutputStream(f);
		wb.write(fos);
		System.out.println("Data Written");
		
		
		//Reading values
		fis = new FileInputStream(f);
		wb=new XSSFWorkbook(fis);
		sheet=wb.getSheet("ListOfProgrammingLanguages");
		//row 1
		row=sheet.getRow(0);
		cell=row.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		
		//row 2
		row1=sheet.getRow(1);
		cell=row1.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		
		//row3
		row2=sheet.getRow(2);
		cell=row2.getCell(0);
		System.out.println(cell.getStringCellValue());
		
				
		//row4
		row3=sheet.getRow(3);
		cell=row3.getCell(0);
		System.out.println(cell.getStringCellValue());
	
		
		
		//row5
		row4=sheet.getRow(4);
		cell=row4.getCell(0);
		System.out.println(cell.getStringCellValue());
		
		
		
		int n=sheet.getPhysicalNumberOfRows();
		System.out.println("no of rows:"+n);
		
		int m=row.getPhysicalNumberOfCells();
		System.out.println("no of cells:"+m);
		
		for(int j=0;j<m;j++)
		{
			System.out.println(sheet.getRow(0).getCell(j).getStringCellValue());
	}
		
		
		fos.close();
		wb.close();
 
	}
}
