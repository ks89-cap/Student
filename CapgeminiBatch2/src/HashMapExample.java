import java.util.HashMap;

public class HashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hashmap= new HashMap<>();
		hashmap.put("john",25);
		hashmap.put("Alice", 30);
		hashmap.put("Bob",35);
		
		//Access and print values based on keys
		
		System.out.println("age of john: "+hashmap.get("john"));
		System.out.println("age of john: "+hashmap.get("Alice"));
		
		//Check if key exists in hashmap
		System.out.println("is bob present? "+ hashmap.containsKey("Bob"));
		System.out.println("==============================================================");

		
		//update the value associated with a key
		hashmap.put("Alice", 32);

		
		//remove a key-pair from the hashmap
		
		hashmap.remove("john");


		
		//print all the key-pair value
		
		for(String key:hashmap.keySet())
		{
			System.out.println(key+":"+hashmap.get(key));
			
		}
		System.out.println("==============================================================");

		 //check the size of the hashmap
		System.out.println("the size is "+hashmap.size());

		

	}

}
