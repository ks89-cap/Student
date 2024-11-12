
public class TwoDArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 2D Array:
		 * datatype name_array[][]={{},{},{}};
		 */
		int array_val[][]= {{20,60,20},{30,70,30},{40,80,40},{50,90,50}};
		int array_len= array_val.length;
		System.out.println(""+array_len);
		System.out.println("==============================");
		int size_col_array=array_val[0].length;
		System.out.println(size_col_array);
		System.out.println("==============================");
		/*
		 * traverse from initial value
		 */
		for(int i=0;i<array_len;i++)
		{
			for(int j=0;j<size_col_array;j++)
			{
				System.out.print(array_val[i][j]+" ");
			}
		}

	}

}
