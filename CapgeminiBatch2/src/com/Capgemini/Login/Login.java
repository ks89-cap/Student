package com.Capgemini.Login;

public class Login {

	
		// TODO Auto-generated method stub
	private String city="Bangalore";
	private boolean status=true; //called only inside the class
		protected int empId()
		{
			return 1020;
			
		}
		protected String empName()
		{
			return "john";
		}
		public static void main(String[] args)
		{
			Login login= new Login();
			System.out.println(login.city);
			System.out.println(login.status);
			System.out.println(login.empId());

		}

	}


