package Selection_Sort;

import java.util.Scanner;

public class SelectionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		System.out.println("enter the size");
		int size=sc.nextInt();
		
		
		System.out.println("enter the array: ");
		int arr[]= new int[size];
		
		//int arr1[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			//arr1[i]=sc.nextInt(size);
			arr[i]=sc.nextInt();
			
		}
		sc.close();
		for(int i=0;i<arr.length;i++)
		{
			int min_len=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]<arr[min_len])
				{
					int temp = arr[min_len];
					arr[min_len]=arr[j];
					arr[j]=temp;
				}
					
				
			}
			
		}
		System.out.println("the sorted array in ascending order : ");

		for( int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("========================================== ");

		for(int i=0;i<arr.length;i++)
		{
			int min_len=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]>arr[min_len])
				{
					int temp = arr[min_len];
					arr[min_len]=arr[j];
					arr[j]=temp;
				}
					
				
			}
			
		}
		System.out.println("the sorted array in descending order : ");

		
		for( int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}

		System.out.println("========================================== ");

		

	}

}
