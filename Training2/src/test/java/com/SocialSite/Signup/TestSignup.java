package com.SocialSite.Signup;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.jupiter.api.Test;

import Capgemini.Training.App;

public class TestSignup {
	public static void main(String[] args)
	{
	Signup app= new Signup();
		String regex="^(.+)@(.+)$";
		String email=app.userEmail("abc@gmail.com");
		Pattern pattern= Pattern.compile(regex);
		Matcher match=pattern.matcher(email);
		System.out.println(match.matches());
		System.out.println(email);
		int pwd=app.userPassword(4646456);
		System.out.println(pwd);
		app.login();
	}
	/*public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.err.println("enter the name");
		String name=sc.next();
		
		System.err.println("enter the surname");
		String surname=sc.next();
		
		System.err.println("enter the Mobile");
		String mobile=sc.next();
		
		System.err.println("enter the Date");
		String date=sc.next();

		Signup s= new Signup();
		s.Name(name);
		s.surname(surname);
		s.Mobile(mobile);
		s.Date(date);

	}*/
	@Test
	public void testApp()
	{
		assertTrue(true);
	}

}
