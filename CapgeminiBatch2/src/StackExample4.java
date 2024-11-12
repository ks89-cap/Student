/*
 * Create an Object of stack class with character type
declare a string as "java"
use for each loop to add all characters
create an Object of String Builder class
verify its notempty then perform pop operation
display reverse value in console
 */
import java.util.Collections;
import java.util.Stack;

public class StackExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Character> st= new Stack<>(); //take datatype as character
		String str="java";
		for(char ch:str.toCharArray()) //adding each characters in string one by one by converting it to char
		{
			System.out.println(st.push(ch));
		}
		boolean a= st.isEmpty();
		System.out.println(a);
		Collections.reverse(st);
		System.out.println(st);

		

	}

}
