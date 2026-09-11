package com.tnsif.java.abstractdemo1;

public abstract class Shape {
	
	protected int area;
	
	abstract void calculateArea();
	
	public void showArea()
	{
		System.out.println("The area is :"+area);
	}
}
