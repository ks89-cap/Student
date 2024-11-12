import java.util.ArrayList;
import java.util.HashSet;

public class HashSetExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> hs= new HashSet<>();
		hs.add("Books");
		hs.add("Pen");
		hs.add("Speakers");
		hs.add("Mouse");
		for(String i:hs)
		{
			System.out.println(i);
		}
		System.out.println("====================================");
		
        ArrayList<String> ls = new ArrayList<>(hs);   //set convertinf to array
        System.out.println(ls.contains("Keyboard"));
        System.out.println(ls);
        


		

	}

}
