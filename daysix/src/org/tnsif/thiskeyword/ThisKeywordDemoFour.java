package org.tnsif.thiskeyword;

public class ThisKeywordDemoFour {
	int x;
	ThisKeywordDemoFour()
	{
		//default constructor
		this(34);
		System.out.println("Default Constructor");
	}
	ThisKeywordDemoFour(int x)

	{
		//parameterized constructor
		this.x=x;
		System.out.println("Parameterized Constructor:"+x);
	}
	public static void main(String[] args) {
		ThisKeywordDemoFour t=new ThisKeywordDemoFour();
	 

	}

}
