package org.tnsif.singledimensionarray;
import java.util.Arrays;
import java.util.Scanner;


//program to demonstrate on runtime array and to find out largest element in an array

public class ArrayMaxElement {
	
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the no. of elements in an array:");
		int n=s.nextInt();
		//array declarations 
		int arr[]=new int[n];
		//array declarations
		for (int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
			
		}
		System.out.println("array of elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
		System.out.println(); 
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
				
			}
		}
		System.out.println("The largest element in the array is:"+max);
		Arrays.sort(arr);
		for(int i=0;i<n;i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
	

}
