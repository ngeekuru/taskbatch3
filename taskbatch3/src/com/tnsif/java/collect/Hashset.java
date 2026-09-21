package com.tnsif.java.collect;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		HashSet hs = new HashSet();
		hs.add(101);
		hs.add(101);
		hs.add(null);
		hs.add("tns");
		hs.add("tns");
		hs.add(23.45);
		hs.add(23.45);
		System.out.println(hs);
		System.out.println(hs.remove(23.45));
		System.out.println(hs);
		
	}

}
