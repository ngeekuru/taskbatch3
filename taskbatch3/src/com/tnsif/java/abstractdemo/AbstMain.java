package com.tnsif.java.abstractdemo;

public class AbstMain {

	public static void main(String[] args) {
		Addition a = new Addition();
		a.calculate();
		a.show(); 
		
		Subtraction s = new Subtraction();
		s.calculate();
		s.show();
		
		Multiplication m = new Multiplication();
		m.calculate();
		m.show();
	}

}
