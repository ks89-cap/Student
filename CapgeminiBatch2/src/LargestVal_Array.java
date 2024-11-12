
public class LargestVal_Array {

		static int[] arr= {10,20,30,40,50};
		
		static int largest()
		{
			int max_elt= arr[0];
			int i;
			for(i=1;i<arr.length;i++)
			{
				if(arr[i]>max_elt)
				{
					max_elt=arr[i];
				
				}
				
				
		}
			return max_elt;
			
		
		}
		public static void main(String[] args)
		{
			System.out.println(largest());
		}
		
		

	

}
