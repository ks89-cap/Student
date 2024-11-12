import java.util.Scanner;
import java.util.TreeMap;

public class TreeMapExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<String,String> tm= new TreeMap<>();
		tm.put("Delhi", "Delhi");
		tm.put("Karnataka", "Andhra Pradesh");
		tm.put("Mumbai", "Bangalore");
		tm.put("UttarPradesh", "Punjab");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the key to search: ");
		String s= sc.next();

		if(tm.containsKey(s))			
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);

		}
			


	}

}
