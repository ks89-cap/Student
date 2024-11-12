package Apache.OperationsJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateFile1 {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File f= new File(System.getProperty("user.dir")+"//TestData//Employee.xls");
		FileOutputStream fos= new FileOutputStream(f);
		System.out.println("The excel has been created");
		
		

	}

}
