
public class VerifyCredentials {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
VerifyCredentials credentials= new VerifyCredentials();
System.out.println(credentials.email("capgemini@gmail.com"));
System.out.println(credentials.pass("123456789"));
//String expected_email="capgemini@gmail.com";
//String expected_pwd="123456789";

/*if(credentials.email("capgemini@gmail.com").equals(expected_email))
{
	System.out.println("passed");
}
else {
	System.out.println("failed");
}
	
	*/
//System.out.println(credentials.expected_email);

//System.out.println(credentials.expected_pwd);
	}
public String email(String email_address)
	{
		return email_address;
	}
	public String pass(String pwd)
	{
		return pwd;
	}

}
