package Apache.OperationsJava;  //name of the package which i created

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class CreateFile {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		/*
		 * Create an excel file and set TestInputs and perform all the regarding operations
		 * 
		 * File Class
		 * FileOutputStream
		 */
		File f= new File(System.getProperty("user.dir")+"//TestData//Capgemini.xls");
		FileOutputStream fos= new FileOutputStream(f);
		System.out.println("file created");
		
		

	}

}
