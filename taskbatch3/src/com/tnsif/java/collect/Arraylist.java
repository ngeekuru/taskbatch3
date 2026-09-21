package com.tnsif.java.collect;

import java.util.ArrayList;

public class Arraylist {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		
		al.add(101);
		al.add(102);
		System.out.println("Allowing multiple values: "+al);
		al.add(102);
		System.out.println("Allowing Duplicates values: "+al);
		al.add(null);
		System.out.println("Allowing null values: "+al);
		al.add("Hello");
		System.out.println("Allowing heterogenous values: "+al);
		
		System.out.println("GetFirst method : "+al.getFirst()); //retrive the values by index
		
		al.remove(3);
		System.out.println(al.remove(2));
		
		System.out.println(al);
		//101,102,102,null,Hello ->null,102==>101,102,Hello
	}

}
