package com.tnsif.java.collect;

import java.util.ArrayList;
import java.util.Collections;

public class StudentSorting {
	 public static void main(String[] args) {

	        ArrayList<Student> students = new ArrayList<>();

	        students.add(new Student(101, "Rahul", 85));
	        students.add(new Student(102, "Priya", 92));
	        students.add(new Student(103, "Anil", 76));
	        students.add(new Student(104, "Sneha", 88));

	        System.out.println("Before Sorting:");

	        for (Student s : students) {
	            s.display();
	        }

	        // Sort students
	        Collections.sort(students);

	        System.out.println("\nAfter Sorting:");

	        for (Student s : students) {
	            s.display();
	        }
	    }
}
