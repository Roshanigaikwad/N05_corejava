package org.tnsif.finalkeyword;

//program to demonstarte on final keyword with variable

public class FinalVariable {
	
	//The final field NUM may not have been initialized
	
	//final NUM
	final float SALARY=78000.67f;
	
	public void print()
	{
		
		/* we cannot changr the value of final variable*/
		//SALARY=89000.56f
		System.out.println("salary is :"+SALARY);
				
				
	}

}
