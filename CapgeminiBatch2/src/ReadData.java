import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadData {
	static File f;
	static FileReader fr;
	static BufferedReader br;

	public static void main(String[] args) throws IOException {
		//create an onj of file
		//create an obj of bufferedData
		f= new File(System.getProperty("user.dir")+"//TestData//Login.txt"); //user.dir is mentioning my project.
		System.out.println("file name is:"+f.getName()); // to get the name of the file
		//create an obj of filereader
		fr = new FileReader(f);
		br= new BufferedReader(fr);
		//initialize and declare string obj
		String line= null;
		//check whether the data is present in the file or not
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
			
		}

	}

}
