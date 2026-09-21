package com.tnsif.java.exceptions;

public class exceptionDemo {
	int a=10;
	int b=20;
	
	public void divide()
	{
		
		try {
			int results = a/b;
			System.out.println(results);	
			
			int[] arr = {1,2,3,4};
			for(int i=0;i<=5;i++)
			{
				System.out.println(arr[i]);
			}
			
		}catch(ArithmeticException E)
		{
			System.out.println("you have divided with zero");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("ArrayException");
		}
		
		finally {
			System.out.println("Program executed successfully ");
		}
	}
}
