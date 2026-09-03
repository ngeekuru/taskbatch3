package com.tnsif.java.accessmod.pack2;

import com.tnsif.java.accessmod.pack1.sameClass; //sameClass,diffClass

public class withChild extends sameClass{
	public static void main(String args[])
	{
		withChild obj2 = new withChild();
		//System.out.println(obj2.a); 
		//System.out.println(obj2.b); 
		System.out.println(obj2.c); 
		System.out.println(obj2.d); 
	}
}
