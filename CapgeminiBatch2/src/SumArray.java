
public class SumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] new_array= new int[5];
		int len_array= new_array.length;
		new_array[0]=10;
		new_array[1]=15;
		new_array[2]=20;
		new_array[3]=25;
		new_array[4]=30;
		
		int sum=0;
		for(int i=0;i<len_array;i++)
		{
			sum+=new_array[i];
		}
		System.out.println(sum);
		

	}

}
