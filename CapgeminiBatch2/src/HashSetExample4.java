import java.util.HashSet;

public class HashSetExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Object> hs= new HashSet<>();
		hs.add("Selenium Java");
		hs.add(1020);
		hs.add(true);
		hs.add("C");
		Object[] arr=hs.toArray();
		for(Object i:arr)
		{
			System.out.println(i);
		}
		System.out.println(arr.length);	
		hs.remove(true);
		hs.clear();

	}

}
