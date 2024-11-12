import java.util.HashMap;

public class HashMapExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hp= new HashMap<>();
		hp.put("India", 11);
		hp.put("Maldives", 12);
		hp.put("Srilanka", 13);
		
		//remove maldives
		hp.remove("Maldives");
		
		//print the size
		System.out.println("the size of the hashmap is: "+hp.size());



	}

}
