
public class ArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Create a single array 
		 * synatx: datatype[] arrayname= new datatype[size];
		 * index always strts from 0.
		 * 
		 * 2d Array:
		 * 
		 * */
		int[] array_name= new int[3];  // [size]=3,length
		// get the length of array
		int length_array=array_name.length;
		System.out.println("length of the array: "  + length_array);
		/*
		 * Add value in the array
		 */
		array_name[0]=10;
		array_name[1]=20;
		array_name[2]=30;
		System.out.println("======================================");

		System.out.println(array_name[0]);
		System.out.println(array_name[1]);
		System.out.println(array_name[2]);
		System.out.println("======================================");

		/*
		 * Display all the values through forloop
		 */
		for(int i=0;i<length_array;i++)
		{
			System.out.println(array_name[i]);
		}
		
		// String ARRAY
		
		String[] array_name1= new String[3];
		array_name1[0]="hello";
		array_name1[1]="java";
		array_name1[2]="capgemini";
		for(int i=0;i<length_array;i++)
		{
			System.out.println(array_name1[i]);
		}
		
		//declaration of array in different ways
		String[] automation_tools= {"selenium","java","python"};
		//String new_array[]= new String[2];
		
		int length_automation_tools= automation_tools.length;
		System.out.println("length : "+length_automation_tools);
		for(int i=0;i<length_automation_tools;i++)
		{
			System.out.println(automation_tools[i]);
		}

	}

}
