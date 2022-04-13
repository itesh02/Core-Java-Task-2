package com.cetpa;

import java.util.Scanner;

public class DiamondPattern 
{
	Scanner sc=new Scanner(System.in);
	int rows,i,j;
	
	DiamondPattern()
	{
		System.out.println("Enter number of rows");
		rows = sc.nextInt();
		pattern();
	}
	void pattern()
	{
		for(i=0;i<=rows;i++)
		{
			for(j=1;j<=rows-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.print("\n");
		}
		for(i=rows-1;i>=1;i--)
		{
			for(j=1;j<=rows-i;j++)
				System.out.print(" ");
			for(j=1;j<=2*i-1;j++)
				System.out.print("*");
			System.out.print("\n");
		}
	}
	public static void main(String []args)
	{
		new DiamondPattern();
	}
}
