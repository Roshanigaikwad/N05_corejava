package org.tnsif.loop;

import java.util.Scanner;

public class LeftRightTriangle {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		 System.out.print("enter value: ");
	        int value = s.nextInt();

	        for (int i = 1; i <= value; i++) {
	            for (int j = 1; j <=value - i; j++) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= i; k++) {
	                System.out.print("*");
	            }

	            System.out.println(); 
	        }

	        s.close();
	    }



	}

