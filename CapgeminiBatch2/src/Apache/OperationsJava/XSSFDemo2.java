package Apache.OperationsJava;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class XSSFDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		XSSFWorkbook wb= new XSSFWorkbook();
	XSSFSheet sh = wb.createSheet("Employee data");
	Map<String,Object[]> data= new TreeMap<String,Object[]>();
	data.put("1", new Object[] {"ID","NAME","LASTNAME"});
	data.put("2", new Object[] {"1","AMIT","LAL"});
	data.put("3", new Object[] {"2","KRISHNA","PRIYA"});
	data.put("4", new Object[] {"3","ABHIRAM","MURALI"});
	
	//iterate over data and write to sheet
	Set<String>keyset=  data.keySet();
	int rownum=0;
	for(String key:keyset)
	{
		Row row= sh.createRow(rownum++);
		Object[] objarr=data.get(key);
		int cellnum=0;
		for(Object obj:objarr)
		{
			Cell cell=row.createCell(cellnum++);
			if(obj instanceof String)
			{
				cell.setCellValue((String)obj);
			}
			else if(obj instanceof Integer)
				{
					cell.setCellValue((Integer)obj);
					}
			}
	}
		try {
			FileOutputStream out= new FileOutputStream(new File("TestData//howtodoinjava_demo.xlsx"));
			wb.write(out);
			out.close();
			wb.close();
			System.out.println("written successfully");
		}
		catch(Exception e)
		{
			e.printStackTrace();
		
		
		}	
		

	}

}
