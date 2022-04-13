package com.cetpa;

import java.util.Scanner;

public class Reverse 
{
	String str;
	Scanner sc=new Scanner(System.in);
	Reverse()
	{
		System.out.println("Enter a string:");
		str=sc.next();
		reverse();
	}
	void reverse()
	{
		char []temp=str.toCharArray();
		System.out.println("Reversed String:");
		for(int i=temp.length-1;i>=0;i--)
		{
			System.out.print(temp[i]);
		}
	}
	public static void main(String[] args) 
	{
		new Reverse();
	}
}
