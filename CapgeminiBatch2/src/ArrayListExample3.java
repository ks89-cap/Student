//REFER THE ARRAYLIST EXAMPLE2

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<Integer> arr= new ArrayList<>(List.of(10,20,30,40,50));
		System.out.println("elemnet at index 2: "+arr.get(2));
		int sum= arr.stream().mapToInt(Integer:: intValue).sum();
		System.out.println("sum of arraylist elements "+sum);
		int avg=sum/arr.size();
		System.out.println("average of arraylist elements "+avg);

		
		arr.set(2, 60);
		
		System.out.println("updated element is: "+arr.get(2));
		
		System.out.println("updated elements are");
		for(int num:arr)
		{
			System.out.println(num);
		}

		

		
		// TODO Auto-generated method stub

	}

}
