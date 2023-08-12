package org.tnsif.uncheckedexception;

import java.util.Scanner;

public class FinallyBlockNotExecutedExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
try {
			
			System.out.println(x/y);
			//when we used system.exit(0),then finally block does not executed
			//System.exit(0);
		  
		}
		//catch block is used to handled the exception
		catch(Exception e)
		{
			System.out.println("Exception handled "+e);
			//when we used system.exit(0),then finally block does not executed
			//System.exit(0);
		}
        finally
        {
        	
        	//when finally block contains an exception then finally block does not executed
        	//System.out.println(4/0);
        	System.out.println("Finally block is always executed");
        }
s.close();

	

	}

}
