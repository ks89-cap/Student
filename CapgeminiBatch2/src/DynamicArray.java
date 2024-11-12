import java.util.ArrayList;

public class DynamicArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * create an obj in arraylist= generic and non generic ways
		 * list interface
		 * list interface extends collection
		 */
		//ArrayList list= new ArrayList();  //non generic objects
		ArrayList<String> list= new ArrayList<String>();
		//ArrayList<object> list= new ArrayList<object>();//this means the value shud be in string only
		//list.add(true);
		//list.add(89587845);

		/*
		 * add data in list
		 */
		list.add("java selenium");
		list.add("python");
		list.add("c#");
		//display elements from list
		System.out.println(list);
		System.out.println("===============================");

		/*for(int i=0;i<list.size();i++) //generic
		{
			System.out.println(list.get(i));
		}
*/
		for(String res:list)
		{
			System.out.println(res);
		}


	}

}
