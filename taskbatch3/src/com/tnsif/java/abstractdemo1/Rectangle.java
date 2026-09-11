package com.tnsif.java.abstractdemo1;

public class Rectangle extends Shape{
	
	int height=2;
	int width =4;
	
	@Override
	void calculateArea() {
		super.area = height*width;	
	}

}
