package com.tnsif.java.lamdaexp;

@FunctionalInterface
interface Student{	
	void study();  //Functional Interface
}
public class StudentDetails {
	public static void main(String[] args) {
		Student s = ()-> {
			System.out.println("Hello everyone");
		};
		
		// Student s = ()->   //lambda Expression
		
		s.study();
	}
}
