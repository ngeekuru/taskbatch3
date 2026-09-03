package com.tnsif.java.inheritance;

class A{
		int StudId = 101;
		String Sname = "Bhavana";
		double marks = 93.3;
}
class B extends A{
	
	public void displayMarks()
	{
		System.out.println(Sname +" got marks : "+marks);
	}
}
public class hierarchialInh extends A{
	public void showdetails()
	{
		System.out.println("The details are :"+StudId+ " name : "+Sname+ " marks are:" + marks);
	}
}
