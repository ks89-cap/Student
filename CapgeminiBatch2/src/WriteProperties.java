import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteProperties {

	public static void main(String[] args) throws IOException {
		/*
		 * write and read cross browser platform info
		 * using ppptys file and utilized pptys class
		 * =========================================================
		 * File class
		 * FileoUTPUTsTREAM
		 * Properties class
		 * =========================================================
		 * setProperty
		 * put("key","value")
		 * store()
		 * getProperty(String)
		 */
		File f= new File(System.getProperty("user.dir")+"//TestData//config1.properties");
		//ceate an  obj of properties class
		Properties pop= new Properties();
		//set data
		pop.put("Browsername", "chrome");
		pop.put("URL", "https://Google.com");
		//create an obj of fileoutputstream
		FileOutputStream fos= new FileOutputStream(f);
		//store the dat ain properties file
		pop.store(fos, "browser name and URL added");
		System.out.println("data is written in properties file");
		

	}

}
