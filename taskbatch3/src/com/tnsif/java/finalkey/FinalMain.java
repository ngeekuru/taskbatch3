package com.tnsif.java.finalkey;

public class FinalMain {

	public static void main(String[] args) {
		Bank b = new Bank("Nikhitha","SBI");
		
		Bank b1 = new Bank("Rohith","HDFC");
		
		b.showDetails();
		b.LoanRules();
		
		b1.showDetails();
		

	}

}
