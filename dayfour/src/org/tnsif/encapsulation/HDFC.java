//program to demonstrate on encapsulation encapsulation achieves the data hiding using private access specifier
package org.tnsif.encapsulation;

public class HDFC {
	//private data members
private long accountNo;
private int CvvNo;
private String accountType;
private int pinNo;
//public long AccountNo;
public long setAccountNo;



public long getAccountNo() {
	return accountNo;
}

public void setAccountNo(long accountNo) {
	this.accountNo = accountNo;
}

public int getCvvNo() {
	return CvvNo;
}

public void setCvvNo(int cvvNo) {
	CvvNo = cvvNo;
}

public String getAccountType() {
	return accountType;
}

public void setAccountType(String accountType) {
	this.accountType = accountType;
}

public int getPinNo() {
	return pinNo;
}

public void setPinNo(int pinNo) {
	this.pinNo = pinNo;
}

public long getSetAccountNo() {
	return setAccountNo;
}

public void setSetAccountNo(long setAccountNo) {
	this.setAccountNo = setAccountNo;
}



}






	


