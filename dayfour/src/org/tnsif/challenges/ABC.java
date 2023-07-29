/* Ask the user for their year encoded as two digit(like "62") and for the current year,also encoded as two digit(like"99")
 * Write a program to find the user current age in years*/

package org.tnsif.challenges;

import java.util.Scanner;

public class ABC {
	static void ABC(int by,int cy)
	{
		if(cy>by)
			System.out.println(cy-by);
		else
			System.out.println((100-by)+cy);
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int by=s.nextInt();
		int cy=s.nextInt();
		ABC(by,cy);
		
		

	}

}
