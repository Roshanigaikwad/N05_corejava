package org.tnsif.singledimensionarray;
//program to demonstrate on array using compile-time input value

public class ArrayExample {

	public static void main(String[] args) {
		//Declarations and initialization of an array at compile-time
		
		int arr[]= {44,56,32,28};
		System.out.println("The array of 2nd index is:"+arr[2]);
		
		//To print all the value of the array
		for(int i:arr)
		{
			System.out.print(i+" ");
			
		}
		
		
	


	}

}
