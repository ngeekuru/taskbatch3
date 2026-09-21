package com.tnsif.java.throwdemo;

class demo{
	int age=12;
	
	public void show() throws Exception {
		if(age<18)
		{
			throw new Exception("Not eligible");
		}else {
			System.out.println("eligible");
		}
	}
}


public class throwsdemo {

	public static void main(String[] args) {
		demo d = new demo();
		try {
			d.show();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
