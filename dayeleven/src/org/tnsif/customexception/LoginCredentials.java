package org.tnsif.customexception;

//program to demonstrate user-defined exception
public class LoginCredentials extends Exception {
	//private data member
	private String str;
	
//getter setter
	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}
//Parameterized constructor
	public LoginCredentials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredentials [str=" + str + "]";
	}
	
	

}
