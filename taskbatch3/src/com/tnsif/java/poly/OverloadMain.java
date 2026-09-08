package com.tnsif.java.poly;

public class OverloadMain {

	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		md.show();
		md.show(2, 3.2f);
		md.show(4.2f, 10);
	}

}
