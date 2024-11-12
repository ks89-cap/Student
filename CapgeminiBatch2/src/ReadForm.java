import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class ReadForm {
	static File f;
	static FileReader fr;
	static BufferedReader br;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		f= new File(System.getProperty("user.dir")+"//TestForm//Form.txt");
		fr= new FileReader(f);
		br= new BufferedReader(fr);
		String text= null;
		while((text=br.readLine())!=null)
		{
			System.out.println(text);
		}
		

	}

}
