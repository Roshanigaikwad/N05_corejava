//program to demonstrate access specifier

package org.tnsif.accessspecifier;

public class Bank {
	
	//different access specifier
	public String bankName="SBI";
	private int pinNO=1221;
	long accountNo=1234567865;
	 
	public void displayPublic()
	{
		System.out.println("Bank Name is:"+bankName);
	}
	//private method
	private void displayPrivate()
	{
		System.out.println("Pin No is:"+pinNO);
	}
	//default method
	
	
	
	

}
