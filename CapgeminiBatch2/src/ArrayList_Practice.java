import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList_Practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list= new ArrayList<Object>();
		list.add("uSERNAME: PETER");
		list.add("email: peter@gmail.com");
		list.add("phone no: 7889829892");
		list.add("age: 25");
		Iterator<Object> itr=list.iterator();
		while(itr.hasNext())
				{
			System.out.println(itr.next());
				}
		System.out.println("===============================");

		Object rem_elt= list.remove(2);
		System.out.println(rem_elt);
		System.out.println("===============================");
		
			System.out.println(list.indexOf("age: 25"));
			System.out.println("===============================");
			boolean b= list.contains("Smith");
			System.out.println(b);
			System.out.println("===============================");

			boolean a=list.isEmpty();
			System.out.println("is it empty::"+ a);

	

		

	}

}
