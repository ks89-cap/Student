import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<Integer> num= new ArrayList<>(List.of(20,30,10,40,50));
		
		//Access and print elts from array list
		System.out.println("elemnet at index 0: "+num.get(0));
		System.out.println("elemnet at index 2: "+num.get(2));
		System.out.println("elemnet at index 4: "+num.get(4));
		
		//Calculate and print the sum of all elemnts in the ArrayList
		int sum=num.stream().mapToInt(Integer::intValue).sum();
		System.out.println("sum of arraylist elements"+sum);
		num.set(2, 35);
		//update an elemnt in araylist
		System.out.println("updated elt at index 2 is:"+num.get(2));
		//iterate through arraylist- using a for each loop and print the elements
		System.out.println("elements in the array list:");
		for (int nums:num)
		{
			System.out.println(nums);
		}
		

		
		
		// TODO Auto-generated method stub

	}

}
