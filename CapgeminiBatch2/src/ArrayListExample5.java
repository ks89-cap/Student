import java.util.ArrayList;
import java.util.List;

public class ArrayListExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr= new ArrayList<Object>(List.of("x,y,z"));
		ArrayList<Object> arr1= new ArrayList<Object>(List.of(1,2,3));
		arr.addAll(arr1);
		System.out.println(arr);

		

	}

}
