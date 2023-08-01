package org.tnsif.thiskeyword;

public class ThisKeywordDemoThree {
	void print(ThisKeywordDemoThree t)
	{
		System.out.println("Hey there,I am using 'this'"+"keyword");
		
	}
	void display()
	{
		
		/*when you call any parameterized method inside non parameterized method then,we get an error,
		 * to overcome that we have to use this keyword as an argument*/
		print(this);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThisKeywordDemoThree t=new ThisKeywordDemoThree();
		t.display();
		

	}

}
