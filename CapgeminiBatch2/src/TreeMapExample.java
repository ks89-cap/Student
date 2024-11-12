import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,Integer> tm= new TreeMap<>();
		tm.put("Alice", 60);
		tm.put("John", 50);
		tm.put("Aman", 65);
		System.out.println(tm.get("Alice"));
		System.out.println(tm.get("John"));
		System.out.println(tm.get("Aman"));
		
		//update
		tm.put("Anu", 20);
		
		//remove
		tm.remove("Aman");
		System.out.println(tm);
		
		//Iterate
		for( String a:tm.keySet())
		{
			int score= tm.get(a);
			System.out.println(a+": "+score);
			
		}

		




		

	}

}
