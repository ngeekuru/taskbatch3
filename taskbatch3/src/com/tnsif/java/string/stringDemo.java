package com.tnsif.java.string;

public class stringDemo {

	public static void main(String[] args) {
		String s = new String("Hello");
		System.out.println(s);
		
		String s1 = "TNS";
		System.out.println(s1);
		
		String Uc = s.toUpperCase();
		System.out.println("The Uppercase str is:"+Uc); //HELLO
		System.out.println("the string value is:"+s);
		
		System.out.println(s.charAt(0)); //l
		System.out.println(s.equals(s));  //s-Hello,s1-TNS
		System.out.println(s);
		
		String n1 = new String("World");
		String n2 = "World";
		
		//both are true 
		System.out.println("equals method:"+ n1.equals(n2)); //true
		System.out.println("== operator:" +n1==n2);  //false
		
		String s3 = "Java";
		char ch = s3.charAt(2);
		System.out.println(ch);
		System.out.println(s3);
		
		
	}
	

}
