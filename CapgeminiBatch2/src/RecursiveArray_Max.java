
public class RecursiveArray_Max {
	static int largest(int arr[],int n,int i) 
	{
		
if(i==n-1)
{
	return arr[i];
}
		
	
	int recMax= largest(arr, n,i+1);
	return Math.max(recMax, arr[i]);
	}

	public static void main(String[] args) {
		int arr[]= {10,324,500,40};
		int n=arr.length;
		System.out.println(largest(arr, n, 0));

	}

}
