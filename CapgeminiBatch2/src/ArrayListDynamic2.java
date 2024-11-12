import java.util.ArrayList;

public class ArrayListDynamic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> list= new ArrayList<Object>();
		list.add("A");
		list.add("John");
		list.add(true);
		list.add(102.0f);
		list.add(74884848);
		System.out.println(list);
		
		//using for loop
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		// using for each loop
		for(Object element:list)
		{
			System.out.println(element);

		}



		
		

	}

}
