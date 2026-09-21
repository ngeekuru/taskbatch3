package com.tnsif.java.collect;

import java.util.ArrayList;

public class GenericsDemo {

	public static void main(String[] args) {
		ArrayList<Integer> al =new ArrayList<Integer>(); 
		
		al.add(101);
		//al.add("Nikhitha");
		al.add(null);
		//al.add(true);
		System.out.println(al);

	}

}
