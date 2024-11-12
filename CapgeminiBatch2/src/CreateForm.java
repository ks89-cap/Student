import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateForm {
	static File f;
	static FileWriter fw;
	static BufferedWriter bw;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		f= new File("TestForm//Form.txt");
		fw= new FileWriter(f);
		bw= new BufferedWriter(fw);
		System.out.println("file created");
		bw.newLine();
		bw.write("fname:Capgemini");
		bw.newLine();
		bw.write("lanme: Testing");
		bw.newLine();
		bw.write("City: Bangalore");
		bw.close();


		


		

	}

}
