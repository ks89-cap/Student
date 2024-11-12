import java.util.LinkedList;
import java.util.List;

public class LinkedList4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l1= new LinkedList<String>(List.of("Chennai","Coimbatore","Mumbai","Kolkata"));
		for(int i=0;i<l1.size();i++)
		{
			System.out.println("The string at index "+i+" is: "+l1.get(i));
		}
		

	}

}
