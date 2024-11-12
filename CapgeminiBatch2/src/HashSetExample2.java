import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<>();
		hs.add("Pass");
		hs.add("Failed");
		hs.add("Average");
		Iterator<String> itr=hs.iterator();
		while(itr.hasNext())
				{
			System.out.println(itr.next());
				}
		
	}

}
