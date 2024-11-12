import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExample4 {
	public static void main(String[] args)
	{
		ArrayList<Object> arr= new ArrayList<Object>();
		arr.add("Python");
		arr.add("c#");
		arr.add("PHP");
		arr.add("JAVA");
		Object rem= arr.remove(3);
		System.out.println("removed string is: "+rem);
		arr.sort(null);
		System.out.println(arr);
		

		
		


		
		
	}

}
