
public class LinearDS {

	public static void main(String[] args) {
		/*CREATE AN ARRAY
		 * modify array in DS
		 * And set similar type of data		 * 
		 */
		int[] num= new int[3]; //declaration and initialization of array
		num[0]=22;
		num[1]=44;
		num[2]=52;
	
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		
		
		
		num[1]=50;
		for(int numbers:num)
		{
			System.out.println(numbers);
		}


		
		
		
	}

}
