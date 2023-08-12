
//program to demonstrate checked exception
package org.tnsif.checkedexception;

import java.io.FileInputStream;

import java.io.FileNotFoundException;


public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
			FileInputStream f=new FileInputStream("C:\\Users\\WIN10\\Desktop\\hello.txt");
			System.out.println("File  found");
		}
		catch (FileNotFoundException e) {
			System.out.println("File is not exist: "+e);
		}
		
		
		

	}

}
