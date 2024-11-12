
public class StringMatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * verify the expected password  with actual password*
 *String class= match with method 
 **/
		String expected_Email="capgemini@gmail.com";
		String expected_Password="123456789";
		// Decision making stmt to verify it match the result or not
		if(expected_Email.equals("capgemini123@gmail.com"))
			{
			System.out.println("Testcase Passed");
			}
		else
		{
			System.out.println("Testcase Faied");
		}
		if(expected_Password.equals("123456"))
		{
			System.out.println("True");
		}
		else {
			System.out.println("Failed");
		}
	}

}
