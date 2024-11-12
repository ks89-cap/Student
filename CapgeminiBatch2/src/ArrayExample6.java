import java.util.ArrayList;

public class ArrayExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<Object> arr= new ArrayList<Object>();
boolean a=arr.isEmpty();
System.out.println("is it empty: "+a);
if(a==true)
{
	arr.add("Capgemini");
	arr.add("Bangalore");
	arr.add("JP NAGAR");
	arr.add("Training");
	System.out.println(arr);
	
}
else
{
	System.out.println("IT IS NOT EMPTY");
}

	}

}
