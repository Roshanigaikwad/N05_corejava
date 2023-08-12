package org.tnsif.abtractkeyword;

public abstract class Operator {
	
	//Abstract
	
	
	abstract void operation();
	
	/* if abstract class contain more than more one method
	 * then provide the implementation to all the abstract*/
	abstract void multiplication();
	
	
	void print(int a,int b)
	
	//concrete method
	{
	
	
		System.out.println(a+b);	

		
	}
	


}


