/*program to demonstrate on default and parameterized constructor*/
package org.tnsif.classobjects;

public class Citizen {
	//data members
	String citizenType;
	long aadharNo;
	String gender;
	String city;
	
	//default constructor
	public Citizen()
	{
		System.out.print("Demonstration on default constructor");
		
	}
	//parameterized constructor
	public Citizen(String citizenType,long aadharNo,String gender,String city) {
		super();
		this.citizenType=citizenType;
		this.aadharNo=aadharNo;
		this.gender=gender;
		this.city=city;
	}
	@Override
	public String toString() {
		return "Citizen [citizenType=" + citizenType + ", aadharNo=" + aadharNo + ", gender=" + gender + ", city="
				+ city + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	

		
	}
	
	
	
