package com.cetpa;

import java.util.Scanner;

public class Factorial 
{
	double n,res=1;
	Scanner sc=new Scanner(System.in);
	Factorial()
	{
		System.out.println("Enter number to calculate factorial");
		n=sc.nextDouble();
		fact();
	}
	void fact()
	{
		for(int i=1;i<=n;i++)
		{
			res = res * i;
		}
		System.out.println("Factorial of "+n+" : "+res);
	}
	public static void main(String []args)
	{
		new Factorial();
	}
}
