package org.tnsif.finalkeyword;
//program to demonstrate on final keyword
public class Circle extends Shape {
	
	
	final float area=34.0f;
	
	
	//final keyword
	//cannot override the final keyword from shape
	final void printShapeType()
	{
		//System.out.println(shapename);
	}
	public void printshapetype(float area) {
		System.out.println(area +"sq.cm");
	}

}
