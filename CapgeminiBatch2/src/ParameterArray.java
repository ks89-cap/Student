
public class ParameterArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ParameterArray array= new ParameterArray();
		int[] value={10,20,30,40,50};
		array.displayArray(value);
		

	}
	public void displayArray(int[] array_val)
	{
		System.out.println("array passed as a parameter in java in method");
		for(int i=0;i<array_val.length; i++)
		{
			System.out.println(array_val[i]);
		}
	}
// do 2D Array for this same prblm
}
