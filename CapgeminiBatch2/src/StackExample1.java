import java.util.Stack;

public class StackExample1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer> st= new Stack<>();     //		Stack<Integer> st= new Stack<>();
		                                      //        st.addAll(List.of(10,20,30)); 

		st.push(10);
		st.push(20);
		st.push(30);
		
		//print the elements in the stack
		System.out.println("the stack is: "+st);
		
		//print the top element of the stack
		System.out.println("the top element"+st.peek());
		
		//print the pop elements in the stack.it pops element from the bottom
		System.out.println("popped element: "+st.pop());
		
		//get the size of the stack
		System.out.println("size: "+st.size());
		
		//iterate over the stack
		for(Integer elemt:st)
		{
			System.out.println(elemt);
		}

		

	}

}
