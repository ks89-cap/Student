import java.util.LinkedList;
import java.util.List;

public class LinkedList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Object> l1= new LinkedList<Object>(List.of(30,"Automation","banagalore"));
		System.out.println("the original linked list is: "+l1);
		System.out.println(l1.get(1));
		System.out.println(l1.get(2));
		l1.set(1, "Pune");

		l1.set(1, "Selenium Java");
		System.out.println(l1);
		

	}

}
