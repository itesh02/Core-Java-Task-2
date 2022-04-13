package com.cetpa;

import java.util.Scanner;

public class FibonacciSeries 
{
	int n,a=0,b=1,c;
	Scanner sc=new Scanner(System.in);
	FibonacciSeries()
	{
		System.out.println("Enter number of terms");
		n=sc.nextInt();
		System.out.print(a+" "+b);
		for(int i=0;i<n-2;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	public static void main(String []args)
	{
		new FibonacciSeries();
	}
}
