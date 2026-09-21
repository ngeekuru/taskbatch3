package com.tnsif.java.collect;

public class Student implements Comparable<Student>{
	
	int rollNo;
    String name;
    int marks;

    Student(int rollNo, String name, int marks) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student s) {

        return this.marks - s.marks;
    }

    void display() {
        System.out.println(rollNo + " " + name + " " + marks);
    }
}
