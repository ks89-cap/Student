package Apache.OperationsJava;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFDemoRead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//iterate over data and write to sheet
			try {
				FileInputStream in= new FileInputStream(new File("TestData//howtodoinjava_demo.xlsx"));
				XSSFWorkbook wb= new XSSFWorkbook(in);
				XSSFSheet sh = wb.getSheetAt(0);
						
				for (Row row : sh) {
	                // Iterate over each cell in the row
	                for (Cell cell : row) {
	                    // Check the cell type and print the value accordingly
	                    switch (cell.getCellType()) {
	                        case STRING:
	                            System.out.print(cell.getStringCellValue() + "\t");  // String cell value
	                            break;
	                        case NUMERIC:
	                            System.out.print(cell.getNumericCellValue() + "\t");  // Numeric cell value
	                            break;
	                        case BOOLEAN:
	                            System.out.print(cell.getBooleanCellValue() + "\t");  // Boolean cell value
	                            break;
	                        default:
	                            System.out.print("Unknown type\t");
	                            break;
	                    }
	                }
	                System.out.println();  // Move to the next row
	            }
				 in.close();
		            wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			
			
			}
					

		
		
		
			
			

		}


	}
