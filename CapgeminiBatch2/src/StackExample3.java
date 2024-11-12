import java.util.Stack;

public class StackExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> st= new Stack<>();
		st.push("pune");
		st.push("bengalore");

		st.push("chennai");
		Object st_arr[]= st.toArray();   // convert it to array from stack
		for(int i=0;i<st_arr.length;i++)
		{
			System.out.println(st_arr[i]);
		}

		

	}

}
