package com.tnsif.java.threads;

class RunDemo implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Runnable thread 1");
		}
	}
	
}

class RunsDemo implements Runnable{

	@Override
	public void run() {
		for(int i=1;i<=10;i++)
		{
			System.out.println("Runnable thread 2");
		}
	}
	
}

public class RunnableDemo {

	public static void main(String[] args) {
	
		RunDemo rd = new RunDemo();
		Thread t1 = new Thread(rd);
		t1.start();
		RunsDemo rs = new RunsDemo();
		Thread t2 = new Thread(rs);
		t2.start();

	}

}
