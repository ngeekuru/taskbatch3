package com.tnsif.java.wrapperclass;

public class wrapperDemo {

	public static void main(String[] args) {
		
		//Auto wrapping (conv pdt-wc)
		int a=20;
		System.out.println("a value: "+a);
		Integer i = new Integer(a);
		System.out.println("i value: "+i);
		
		//Auto Unwrapping (conv wr-pdt)
		int b = i.intValue();
		System.out.println("b value: "+b);
		
		char ch = 'N';
		Character c = new Character(ch);
		System.out.println(c);
		
		char j = c.charValue();
		

	}

}
