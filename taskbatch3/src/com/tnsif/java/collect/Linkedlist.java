package com.tnsif.java.collect;

import java.util.*;


public class Linkedlist {

	public static void main(String[] args) {
		
		List li =new LinkedList();
		System.out.println(li.size());
		
		/*li.add(2, "Nikhitha");
		li.add(0, "Sai");
		li.add(1, "Sheela");
		li.add(3, "Kishor");*/
		
		li.add("101");
		li.add(102);
		li.add("Keerthi");
		li.add(true);
		li.add('h');
		
		System.out.println(li.get(2));
		System.out.println(li.get(0));
		li.remove(2);
		System.out.println(li);
		
		

	}

}
