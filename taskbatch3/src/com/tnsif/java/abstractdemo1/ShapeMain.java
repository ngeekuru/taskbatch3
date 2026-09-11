package com.tnsif.java.abstractdemo1;

public class ShapeMain {

	public static void main(String[] args) {
		Square s = new Square();
		Rectangle r = new Rectangle();
		
		s.calculateArea();
		s.showArea();
		
		r.calculateArea();
		r.showArea();

	}

}
