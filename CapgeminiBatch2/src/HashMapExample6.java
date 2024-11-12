import java.util.HashMap;

public class HashMapExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,String> hp= new HashMap<>();
		hp.put(401, "Capgemini");
		hp.put(402, "Cognizant");

		hp.put(403, "TCS");
		
		for(Integer key: hp.keySet())
		{
			System.out.println(key+":"+hp.get(key));
		}

		
		

	}

}
