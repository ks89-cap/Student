import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteText_Stream {
	static File f;
	static FileWriter fw;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Create a Text File
		 * Write data in the  same text file
		 * close the file
		 * =====================================================
		 * File Class
		 * FilewriterCass
		 * BufferWriterClass   
		 */
		//Create an obj of file
	     f= new File("TestData//Login.txt");
		//create an obj of fileWriter
		fw= new FileWriter(f);
		//Create an obj of BufferWriter
		bw= new BufferedWriter(fw);
		System.out.println("file created");
		bw.write("username:john");
		bw.newLine();
		bw.write("password: ****23");
		bw.newLine();

		String line="=================================";
		bw.write(line);

		
		bw.close();
		

	}

}
