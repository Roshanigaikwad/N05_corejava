package org.tnsif.uncheckedexception;

import java.io.IOException;

//program to demonstrate throw keyword

public class ThrowExecutor {
	//throws keyword is used to declared an exception
	
	static void isEligible(int age,int weight) throws IOException
	{
		if(age>18 && weight>50)
		{
			System.out.println("Eligible to donate blood");
		}
		else
			//throw keyword is used to
			throw new IOException("age and weight criteria is not fullfill");
	}

	public static void main(String[] args) throws IOException {
		isEligible(12,54);
		

	}

}
