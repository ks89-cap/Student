

public class MinMaxValueArray {
	public static void name(String[] args) {
		MinMaxValueArray val= new MinMaxValueArray();
		int[] array= {5,10,15,20,25};
		val.minMaxVal(array);
		
	}
	public void minMaxVal(int[] value)
	{
		for(int i=0;i<value.length;i++)
		{
			System.out.println(value[i]);
			
		}
		
		int min = value[0];
        int max = value[0];

        for (int i = 1; i < value.length; i++) {
            if (value[i] < min) {
                min = value[i];
            }
            if (value[i] > max) {
                max = value[i];
            }
        }

        // Print the min and max values
        System.out.println("Minimum value: " + min);
        System.out.println("Maximum value: " + max);
		
		
	}

}
