import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> l2= new LinkedList<String>(List.of("Pune", "Bangalore", "Chennai","Mumbai"));
		Iterator<String> itr=l2.iterator();
		while(itr.hasNext())
		{
	System.out.print(itr.next());
	System.out.println("");
		}
		// s=l2.sort(null);
		//System.out.println(s);
		System.out.println("reversed linked list");

		Collections.reverse(l2);
		System.out.println(l2);

		
	}
}


