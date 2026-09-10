package com.tnsif.java.finalkey;

public final class Bank {
	
	final int accNo = 2345;
	String HName = "Vishal";
	String BName = "Axis";
	
	public Bank(String hName, String bName) {
		super();
		//this.accNo = accNo;
		HName = hName;
		BName = bName;
	}
	public void showDetails()
	{
		System.out.println("The AccNo is: "+accNo);
		System.out.println("The HolderName is: "+HName);
		System.out.println("The BankName is: "+BName);
	}
	final public void LoanRules()
	{
		System.out.println("if any EMI missed the cibil should be decrese");
		System.out.println("if any EMI is not missed the cibil should be Increase");
	}
}

/*class Customer extends Bank{

public Customer(String hName, String bName) {
	super(hName, bName);
}

public void showCustomer()
{
	System.out.println("Hi This is your customer");
}

/*public void LoanRules()
{
	System.out.println("if any EMI missed the cibil should be not decrese");
	System.out.println("if any EMI is not missed the cibil should be Increase");
}*/


