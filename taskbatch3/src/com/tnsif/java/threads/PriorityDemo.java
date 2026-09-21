package com.tnsif.java.threads;

class TDemo extends Thread{
	public void run()
	{
		System.out.println(Thread.currentThread().getName());
	}
}

public class PriorityDemo {

	public static void main(String[] args) {
		TDemo t1 = new TDemo();
		TDemo t2 = new TDemo();
		TDemo t3 = new TDemo();
		
		 	
		t1.setName("T1->Asha");
		t2.setName("T2->Rohith");
		t3.setName("T3->Eshitha");
		
		t1.setPriority(Thread.MIN_PRIORITY);      // 1
        t2.setPriority(Thread.NORM_PRIORITY);     // 5
        t3.setPriority(Thread.MAX_PRIORITY);
	
		
		
		t1.start();
		t2.start();
		t3.start();
	}

}
