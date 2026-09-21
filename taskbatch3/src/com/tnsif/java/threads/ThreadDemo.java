package com.tnsif.java.threads;

class Demo extends Thread{
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 1");
		}
		
	}
}
class Demo1 extends Thread{
	public void run()
	{
		
		for(int i=1;i<=10;i++)
		{
			System.out.println("Thread 2");
		}
		
	}
}


public class ThreadDemo {

	public static void main(String[] args) {
		Demo d  = new Demo();
		Demo1 d1 = new Demo1();
		d.start();
		d1.start();
		
	}

}
