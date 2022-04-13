package com.cetpa;

import java.util.Scanner;

public class MirrorInverse 
{
	Scanner sc=new Scanner(System.in);
	int []arr;
	int r;
	boolean result;
	
	MirrorInverse()
	{
		System.out.println("Enter Array Size");
		r=sc.nextInt();
		arr = new int[r];
		System.out.println("Enter Array Elements");
		for(int i=0;i<r;i++)
		{
			arr[i] = sc.nextInt();
		}
		result = isMirrorInverse();
		if(result)
			System.out.println("True");
		else
			System.out.println("False");
	}
	public boolean isMirrorInverse()
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[arr[i]] != i)
				return false;
		}
		return true;
	}
	public static void main(String []args)
	{
		new MirrorInverse();
	}
}
