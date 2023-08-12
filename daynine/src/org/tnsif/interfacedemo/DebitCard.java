package org.tnsif.interfacedemo;

public interface DebitCard {
	
	/* by default all the variables inside an interface is public
	 * static final and if it final the we must have to initialize
	 * value to that variable*/
	
	 
	 long cardno=657453684937L;
	 
	 //we cannot use concrete method inside an interface 
	 //by default,method inside an interface is an abstract
	 
	 void displayCardDetails();
	 
	 //default method and static method is the new features of java which can use inside an interface
	 
	 default void display()
	 {
		 System.out.println("Default Method");
		 
	 }
	 
	 //static method
	 static void print()
	 {
		 System.out.println("Static Method");
	 }
		 
	 



	}

