package Apache.OperationsJava;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class SumExcel {
static File f;
static FileInputStream fis;
static FileOutputStream fos;
static XSSFWorkbook wb;
static XSSFSheet sh;
static XSSFRow rw;
static XSSFCell cell,cell1,cell2;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		f=  new File(System.getProperty("user.dir")+"//TestData//Sum.xlsx");
		wb= new XSSFWorkbook();
		sh= wb.createSheet("sumofnumbers");
		rw= sh.createRow(0);
		cell=rw.createCell(0);
		cell1=rw.createCell(1);
		cell2= rw.createCell(2);
		cell2= rw.createCell(2);

		cell3= rw.setCell()
		

		cell.setCellValue(40);
		cell.setCellValue(null)
		
		
		

	}

}
