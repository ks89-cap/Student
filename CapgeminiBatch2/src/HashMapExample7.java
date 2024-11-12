import java.util.HashMap;

public class HashMapExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hp= new HashMap<>();
		hp.put(1, "Karnataka");
		hp.put(2, "Kerala");
		hp.put(3, "Andhra Pradesh");
		
		HashMap<Integer,String> hp1= new HashMap<>();
		hp.put(4, "Bengaluru");
		hp.put(5, "Lucknow");
		hp.put(6, "Bhopal");
		
		//copy secnd hashmap to the first
		
		hp1.putAll(hp);
		
		

	}

}
