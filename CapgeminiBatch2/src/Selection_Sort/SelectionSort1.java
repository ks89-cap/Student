package Selection_Sort;

public class SelectionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,50,5,70};
		

		int n=arr.length;
		System.out.println("unsorted sorted array:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}
		for(int i=0;i<n-1;i++)
			
		{
			int min_val=i;
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min_val])
				{
					int temp=arr[min_val];
					arr[min_val]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("sorted array usin selection sort");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
