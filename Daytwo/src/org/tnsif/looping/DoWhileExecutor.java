package org.tnsif.looping;

import java.util.Scanner;

public class DoWhileExecutor {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		do{
			System.out.println("Value of n is:"+n);
			n++;
			
			
		}while(n<14);

	}

}
