package com.tnsif.java.inheritance;

class parent{
	int a = 20;
	public void parentMethod()
	{
		System.out.println("This is parent class");
	}
}
public class SingleDemo extends parent{
	int b=30;
	public void childMethod()
	{
		System.out.println("This is child class");
		parentMethod();
		System.out.println(a);
	}
	public void add()
	{
		int c = a+b;
		System.out.println(c);
	}
}
