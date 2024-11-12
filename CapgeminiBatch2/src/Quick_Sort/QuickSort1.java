
package Quick_Sort;

import java.util.Arrays;

public class QuickSort1 {
	int partition(int intArray[],int low,int high)
	{
		int pi= intArray[high];
		int i=(low-1);
		for(int j=low;j<high;j++)
		{
			if(intArray[j]<=pi)
			{
				i++;
				//swap intArray[i] and intArray[j]
				int temp= intArray[i];
				intArray[i]= intArray[j];
				intArray[j]= temp;
			}
		}
		int temp= intArray[i+1];
		intArray[i+1]= intArray[high];
		intArray[high]=temp;
		return i+1;
	}
	void quick_sort(int intArray[], int low, int high)
	{
		if(low<high)
		{
			int pi= partition(intArray,low,high);
			quick_sort(intArray,low,pi-1);
			quick_sort(intArray,pi+1,high);

		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int intArray[]= {4,-1,6,8,0,5,-3};
		int n= intArray.length;
		System.out.println(Arrays.toString(intArray));
		QuickSort1 obj= new QuickSort1();
		obj.quick_sort(intArray, 0, n-1);
		System.out.println(Arrays.toString(intArray));

	}

}
