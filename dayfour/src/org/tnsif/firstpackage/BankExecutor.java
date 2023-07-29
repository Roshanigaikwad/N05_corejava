package org.tnsif.firstpackage;

import org.tnsif.accessspecifier.Bank;

public class BankExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bank b=new Bank();
		b.bankName="SBI";
		b.displayPublic();
		/*pin no and display private method are private , so we cannot access into another class and another package,
		 * only we can access private data member 
		 *  inside the same class*/
		//b.pinNo;
		//b.displayPrivate
		//b.accountNo
		/* account no and displayDeafault() method  are default thats why,
		 * we are not access into another package 
		 * only we can access within the same package*/
		//b.displayDefault();
	}

}
