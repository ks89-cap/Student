import java.util.HashMap;

public class HashMapExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> hp= new HashMap<>();
		hp.put("Delhi", 11);
		hp.put("Karnataka", 12);
		hp.put("kerala", 13);
		
		System.out.println("check if delhi is present or not in the hashmap: "+ hp.containsKey("Delhi"));
		System.out.println("check if value of DELHI is present or not in the hashmap: "+ hp.containsValue(11));



		
		

	}

}
