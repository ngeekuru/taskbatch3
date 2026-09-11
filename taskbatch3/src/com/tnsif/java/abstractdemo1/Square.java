package com.tnsif.java.abstractdemo1;

public class Square extends Shape{

	int side = 3;
	
	@Override
	void calculateArea() {
		area = side*side;
	}

}
