import java.util.LinkedList;
import java.util.List;

public class LinkedListexample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> l1= new LinkedList<>(List.of(10,20,30,40,50));
		System.out.println(l1);
		l1.removeFirst();
		System.out.println("linked list after removing the first element: "+ l1);
		
		//checks if elemnts exist
		boolean a= l1.isEmpty();
		System.out.println("is it empty? :"+ a);
		
		//get first and last element of the linkedlist
		int f1=l1.getFirst();
		int last= l1.getLast();
		System.out.println("the first element is: "+f1);
		System.out.println("the first element is: "+last);
		
		//clear the linked list
		l1.clear();
		System.out.println(l1);


		

	}

}
