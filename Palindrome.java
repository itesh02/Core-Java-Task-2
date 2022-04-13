package com.cetpa;

import java.util.Scanner;

public class Palindrome 
{
	int x;
	boolean result=false;
	Scanner sc=new Scanner(System.in);
	Palindrome()
	{
		System.out.println("Enter a number:");
		x = sc.nextInt();
		result=isPalindrome();
		System.out.println(result);
	}
	public boolean isPalindrome()
	{
		if(x < 0)
			return false;
		int div = 1;
		while(x / div >= 10)
		{
			div *= 10;
		}
		while(x != 0)
		{
			int left = x / div;
			int right = x % 10;
			
			if(left != right)
				return false;
			
			x = (x % div) / 10;
			div /= 100;
		}
		return true;
	}
	public static void main(String[] args) 
	{
		new Palindrome();
	}
}
