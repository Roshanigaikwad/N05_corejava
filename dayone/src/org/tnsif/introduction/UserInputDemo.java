// program to demonstrate the problem

package org.tnsif.introduction;

import java.util.Scanner;

public class UserInputDemo {

	public static void main(String[] args) {
		// program to demonstrate the problem
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the value of num");
		int num=s.nextInt();
		System.out.println("the value of num is:"+num); 
		System.out.println("the value of floatnum is:"+num); 
		float num1=s.nextFloat();
		System.out.println("The value of floatnum is:"+num1);
		char c=s.next().charAt(0);
		System.out.println("character is:"+c);
		String str1=s.nextLine();
		//s.next();
		System.out.println("String is:"+str1);
		
		
		

	}

}
