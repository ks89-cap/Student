import java.util.HashSet;

public class HashSetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<>();
		hs.add("V&V");
		hs.add("Full Stack");
		hs.add("Big Data Training");
		 
		//checks wether java trainin gis there or not
		System.out.println(hs.contains("Java"));
		System.out.println(hs.size());

	}

}
