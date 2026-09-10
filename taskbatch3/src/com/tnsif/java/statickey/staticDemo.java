package com.tnsif.java.statickey;

public class staticDemo {
	static int eid=101;
	static String ename="Eshitha";
	
	public static void display()
	{
		System.out.println("the emp id : "+eid);
		System.out.println("the emp name : "+ename);
	}
	static{
		System.out.println("This is static block");
	}
	
}
