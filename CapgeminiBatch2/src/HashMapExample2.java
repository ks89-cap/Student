import java.util.HashMap;

public class HashMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hp= new HashMap<>();
		System.out.println("==========================");
		hp.put(101, "Vijay");
		hp.put(102, "Ravi");
		hp.put(103, "Kishan");
		for(Integer key:hp.keySet())
		{
			System.out.println(key+":"+hp.get(key));
		}
		System.out.println("==========================");

		
		

	}

}
