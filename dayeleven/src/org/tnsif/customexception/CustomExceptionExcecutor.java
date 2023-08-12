package org.tnsif.customexception;

import java.util.Scanner;

//driver class
public class CustomExceptionExcecutor extends Exception{
//to demonstarte
	public static void main(String[] args)  {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter an email and password");
		String email=s.nextLine();
		String password=s.nextLine();
		try {
		if(email.equals("rgaikwad@tnsif.org")&&
				password.equals("pass@123"))
		{
			System.out.println("Credentials matched");
			
		}
		else
		{
			throw new LoginCredentials("Invalid Credentials");
		}
		
		

	}
	catch(LoginCredentials e)
		{
		System.out.println(e);
		}
	}
}
		
		
	
		
	


