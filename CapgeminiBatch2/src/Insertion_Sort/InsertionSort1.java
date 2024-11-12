package Insertion_Sort;

public class InsertionSort1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,3,11,12,5};
		int n=arr.length;
		for(int i=1;i<n;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
				
			}
			//place
			arr[j+1]=key;
		}
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
