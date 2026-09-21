package com.tnsif.java.exceptions;

public class Hello {
	int[] arr = {1,2,3,4,5}; //dynamic 
	public void arr()
	{
		try {
		for(int i=0;i<=8;i++)
		{
			System.out.println(arr[i]);
		}
		}catch(Exception e)
		{
			System.out.println("Array index out");
		}
	}
}
