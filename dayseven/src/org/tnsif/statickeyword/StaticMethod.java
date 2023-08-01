package org.tnsif.statickeyword;

public class StaticMethod {
	
	int x=2;
	static String collegename= "MET";
	
	/*1. if any method outside the main function and if you want to access that 
	 * method inside main function,we have to use to make that method 
	 * as a static*/
	
	public static void print()
	{
		System.out.println(collegename);
		/*2.we cannot use non static variable inside any static method*/
		//System.out.println(x);
	}

	public static void main(String[] args) {
		
		print();

	}

}
