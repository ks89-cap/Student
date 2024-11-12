
public class ForEachloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * FOR EACH LOOP
		 * for(data_type var_name: array_name)
		 *   {}
		 *   
		 *   int array_val[][]= {{20,60,20},{30,70,30},{40,80,40},{50,90,50}};
		int array_len= array_val.length;
		System.out.println(""+array_len);
		System.out.println("==============================");
		int size_col_array=array_val[0].length;
		System.out.println(size_col_array);
		System.out.println("==============================");
		/*
		 * traverse from initial value
		 */
		int array_val[][]= {{20,60,20},{30,70,30},{40,80,40},{50,90,50}};
		int array_len= array_val.length;
		System.out.println(""+array_len);
		System.out.println("==============================");
		int size_col_array=array_val[0].length;
		System.out.println(size_col_array);
		System.out.println("==============================");
	
		for(int[] row:array_val)    //This nested loop iterates through each row of array_val using an enhanced for loop.
			
		{
			for(int element:row)      //For each row, it then iterates through each element in that row 
			{
				System.out.print(element+" "); // prints the element followed by a space.
				
			}
			System.out.println();  //After finishing the inner loop for a row, System.out.println(); is called to move to the next line for the next row's elements.
		}
		

	}

}
