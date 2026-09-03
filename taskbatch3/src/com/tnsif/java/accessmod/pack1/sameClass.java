package com.tnsif.java.accessmod.pack1;

public class sameClass {
	
	private int a=10;
	int b=20;
	protected int c=30;
	public int d=40;
	
	public static void main(String args[])
	{
		sameClass ob1 = new sameClass();
		System.out.println(ob1.a);  //same
		System.out.println(ob1.b);
		System.out.println(ob1.c);
		System.out.println(ob1.d);
	}
}
