package com.Capgemini.Signup;

import com.Capgemini.Login.Login;

public class Signup extends Login{ //since login is protected to use the methods and classes we use extends keyword.
	public static void main(String[] args)
	{
		/*Login login= new Login();
		int login_id= login.empId();
		System.out.println(login_id);
		String username=login.empName();
		System.out.println(username);
		System.out.println(login.city); //cannot be called due to private access modifier.
*/
		//we can't call login here,since it is protected therefore for that we use EXTENDS keyword, after that we can use the signup method itself to call the login values.
		Signup signup= new Signup();
		signup.empId();
		signup.empName();
		System.out.println(signup.empId());
		}

}
