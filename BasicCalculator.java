package com.cetpa;

import java.util.Scanner;

public class BasicCalculator 
{
	static Scanner sc=new Scanner(System.in) ;
	static void input()
	{
		int ch;
		do 
		{
			System.out.println("----------------------------");
			System.out.println("Basic Calculator");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Multiplication");
			System.out.println("4. Division");
			System.out.println("5. Power");
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			System.out.println("----------------------------");
			switch(ch)
			{
			case 1:add();break;
			case 2:sub();break;
			case 3:mul();break;
			case 4:div();break;
			case 5:power();break;
			}
		}while(ch==6);
	}
	static void add()
	{
		System.out.println("Addition");
		double x1,x2,res=0;
		System.out.println("Enter First Number");
		x1=sc.nextDouble();
		System.out.println("Enter Second Number");
		x2=sc.nextDouble();
		res = x1+x2;
		System.out.println("Result: "+res);
		input();
	}
	static void sub()
	{
		System.out.println("Subtraction");
		double x1,x2,res=0;
		System.out.println("Enter First Number");
		x1=sc.nextDouble();
		System.out.println("Enter Second Number");
		x2=sc.nextDouble();
		res = x1-x2;
		System.out.println("Result: "+res);
		input();
	}
	static void mul()
	{
		System.out.println("Multiplication");
		double x1,x2,res=0;
		System.out.println("Enter First Number");
		x1=sc.nextDouble();
		System.out.println("Enter Second Number");
		x2=sc.nextDouble();
		res = x1*x2;
		System.out.println("Result: "+res);
		input();
	}
	static void div()
	{
		System.out.println("Division");
		double x1,x2,res=0;
		System.out.println("Enter First Number");
		x1=sc.nextDouble();
		System.out.println("Enter Second Number");
		x2=sc.nextDouble();
		res = x1/x2;
		System.out.println("Result: "+res);
		input();
	}
	static void power()
	{
		System.out.println("Power");
		double x1,x2,res=0;
		System.out.println("Enter First Number");
		x1=sc.nextDouble();
		System.out.println("Enter Second Number");
		x2=sc.nextDouble();
		res = Math.pow(x1, x2);
		System.out.println("Result: "+res);
		input();
	}

	public static void main(String[] args) 
	{
		input();
	}
}
