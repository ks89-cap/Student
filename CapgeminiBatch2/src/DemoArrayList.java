import java.util.ArrayList;
import java.util.Iterator;

public class DemoArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * a framework
		 * ======================
		 * List(I) extends Collection
		 * ->ArrayList
		 */
		ArrayList<Object> list= new ArrayList<Object>();
		list.add("java");
		list.add(24435);
		list.add(true);
		System.out.println("===============================");

		
		//iterator
		Iterator<Object> itr=list.iterator();
		while(itr.hasNext())
				{
			System.out.println(itr.next());
				}
		//remove
		Object remove_elt=list.remove(1);
		System.out.println(remove_elt);
		System.out.println("===============================");

		
		//
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		System.out.println("===============================");

		//conatains
		boolean result_elt=list.contains("java");
		System.out.println(result_elt);
		

	}

}
