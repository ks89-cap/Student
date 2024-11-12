import java.util.ArrayList;
import java.util.List;

public class ArrayListExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> arr= new ArrayList<Object>(List.of(1,2,3,4,5));
		for(int i=0;i<arr.size();i++)
		{
			System.out.println("the number at index "+i+" is "+arr.get(i));
		}

	}

}
