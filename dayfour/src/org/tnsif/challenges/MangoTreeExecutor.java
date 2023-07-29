/* Pratik is so much interesting in gardening and hence he plant more trees in his garden.
 * he plants trees in a rectangular fashion with order of rows and columns and numbers the trees in a row wise order.
 * he planted the Mango tree only in the first row first column and last column.
 * so,given the tree number and rows and columns.Task is to find out whether the given tree is mango tree or not
 * input n=5 t=11*/



package org.tnsif.challenges;

import java.util.Scanner;

public class MangoTreeExecutor {
	
	static void isMangoTree(int n,int t)
	{
		if(t%n==0 || t%n==1 || t<=n)
		{
			System.out.println("Mango Tree");
		}
		else
		{
			System.out.println("Not a Mango Tree");
		}
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the values of n and t:");
		int n=s.nextInt();
		int t=s.nextInt();
		isMangoTree(n,t);
		
		

	}

}
