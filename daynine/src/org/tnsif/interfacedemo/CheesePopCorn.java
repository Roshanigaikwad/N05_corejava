package org.tnsif.interfacedemo;

//implementation class for a functional interface

//implementable class for a functional interface
public class CheesePopCorn implements PopCorn{

	@Override
	public void displayReceipe() {
		System.out.println("take popcorn packets"
				+ "from shop and cook it in high"
				+ "fire inside a cooker");		
	}

}