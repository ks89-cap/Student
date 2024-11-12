package Buuble_Sort;

import java.util.Scanner;

public class BubbleSort2 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the size");
		int a= sc.nextInt();
		System.err.println("enter the array");
		int arr[]= new int[a];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		System.out.println("the sorted array using bubble sort is: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
	
		
		
		// TODO Auto-generated method stub

	}

}
