package Insertion_Sort;

import java.util.Scanner;

public class InsertionSort2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		System.out.println("enter the array");

		int arr[]= new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=sc.nextInt();
		}
		sc.close();
		for(int i=1;i<arr.length;i++)
		{
			int key=arr[i];
			int j=i-1;
			while(j>=0 && key>arr[j])    //for descending order, key should be grater than arr[j]
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=key;
		}
		System.out.println("array in descending order: ");

		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
