package org.tnsif.finalkeyword;

public class FinalKeywordExecutor {

	public static void main(String[] args) {
		FinalVariable f=new FinalVariable();
		
		//we cannot change the value of final variable
		//f.salary=689567.09f
		
		f.print();
		
		Circle c=new Circle();
		c.printshapeType();
		c.printshapetype(c.area);
		
	

	}

}
