package com.tnsif.java.collect;

class Demo implements Comparable<Demo>{
	
	int stdid;
	String sname;
	double marks;
	
	public Demo(int stdid, String sname,double marks) {
		super();
		this.stdid = stdid;
		this.sname = sname;
		this.marks = marks;
	}
	
	public void show()
	{
		System.out.println("Sname" +sname+ "sid" +stdid + "marks" +marks);
	}

	@Override
	public int compareTo(Demo o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}


public class CompareExample {

	public static void main(String[] args) {
		
		Demo d = new Demo(101,"A",92);
		Demo d1= new Demo(102,"B",93);
		Demo d2= new Demo(103,"C",92);
		
		d.show();
		d1.show();
		d2.show();

	}

}
