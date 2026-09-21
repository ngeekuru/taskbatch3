package com.tnsif.java.lamdaexp;
interface Student{	
	void study();
}
public class StudentDetails {
	public static void main(String[] args) {
		Student s = ()-> System.out.println("Hello everyone");
		s.study();
	}
}
