package org.tnsif.singledimensionarray;

//driver class
//program to demonstrate the array of objects

public class ArraysOfObjectDemo {

	public static void main(String[] args) {
		Employee arr[]=new Employee[2];
		arr[0]=new Employee(101,"Ani Gaikwad",450000.8);
		arr[1]=new Employee(102,"Avi Jadhav",345000.8);
		for(int i=00;i<arr.length;i++)
		{
			System.out.println(arr[i].getID()+" "+arr[i].getName()+" "+arr[i].getSalary());
		}
		

	}

}
