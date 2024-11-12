import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> set= new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Grapes");
		
		//print hashset
		System.out.println("hashset: "+set);
		
		
		//check if it exists
		System.out.println(set.contains("Apple"));
		
		//remove element
		System.out.println(set.remove("Banana"));
		
		//get size
		System.out.println(set.size());
		
		//clear the hashset
		set.clear();
		//check if the hashset is empty
		System.out.println(set.isEmpty());
		
		

	}

}
