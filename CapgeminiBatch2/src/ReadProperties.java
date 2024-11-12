import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	static File f;
	static FileInputStream fis;
	static Properties prop;
	public static void main(String[] args) throws IOException {
		/*
		 * READ DATA FROM THE PROPERTIES
		 * FILE
		 * FILEINPUTSTREAM
		 * PROPERTIES CLASS OBJ
		 * =< LOAD()
		 * ==< GETPROPERTIES()
		 */
		f= new File(System.getProperty("user.dir")+"//TestData//config1.properties");
		fis= new FileInputStream(f);
		prop= new Properties();
		//load properties data
		prop.load(fis);
		String Browsername= prop.getProperty("Browsername");
		System.out.println("name of the browser"+Browsername);
		System.out.println("====================================");
		String URL= prop.getProperty("URL");
		System.out.println("name of the url:"+ URL);
		

	}

}
