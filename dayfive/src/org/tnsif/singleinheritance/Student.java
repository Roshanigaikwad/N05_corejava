//Drive class
package org.tnsif.singleinheritance;

public class Student extends Citizen {
	//private data members
	private int rollno;
	private String collegeName;
	
	//default constructor
	public Student() {
		super();
		System.out.println("Child class-Default Constructor");
	}
	
	
	//parameterized constructor

	public Student(String city,int pincode,long aadharNo,long contactNo,int rollno, String collegeName) {
		super(city,pincode,aadharNo,contactNo);
		this.rollno = rollno;
		this.collegeName = collegeName;
	
	}
	//getter setter

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollegeName() {
		return collegeName;
	}

	public void setCollegeName(String collegeName) {
		this.collegeName = collegeName;
		
	}


	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", collegeName=" + collegeName + ", toString()=" + super.toString() + "]";
	}

	
	}

	

	


