package org.tnsif.loop;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the first number");
		int num1=s.nextInt();
		System.out.println("Enter the second number");
		int num2=s.nextInt();
		System.out.println("choose the opeartor(+,-,/,%,*):");
		 char operator = s.next().charAt(0);
		double result=0.0;
		switch (operator){
		 case '+':
             result = num1 + num2;
             break;
         case '-':
             result = num1 - num2;
             break;
         case '*':
             result = num1 * num2;
             break;
        
         case '/':
        	 result=num1/num2;
        	 break;
		}
        	 
		System.out.println("Result:"+result);
		
			
		
		
		
		
		
	      

	}

}
