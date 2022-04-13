package com.cetpa;

import java.util.Scanner;

public class Transpose 
{
	int rows,columns;
	Scanner sc=new Scanner(System.in);
	int [][]matrix;
	Transpose()
	{
		System.out.println("Enter number of rows");
		rows=sc.nextInt();
		System.out.println("Enter number of columns");
		columns=sc.nextInt();
		matrix=new int[rows][columns];
		set();
		System.out.println("Given Matrix:");
		get();
		calculateTranspose();
		System.out.println("Transpose Matrix:");
		get();
	}
	void set()
	{
		System.out.println("Enter elements :");
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j] = sc.nextInt();
			}
		}
	}
	void get()
	{
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				System.out.print(" "+matrix[i][j]);
			}
			System.out.println();
		}
	}
	void calculateTranspose()
	{
		int [][]temp = new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				if(i==j)
					temp[i][j] = matrix[i][j];
				else 
					temp[j][i] = matrix[i][j];
			}
		}
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				matrix[i][j] = temp[i][j];
			}
		}
	}
	public static void main(String[] args) 
	{
		new Transpose();
	}
}
