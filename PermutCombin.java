package com.cetpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutCombin 
{
	Scanner sc=new Scanner(System.in);
	List<Integer> numbers=new ArrayList<>();
	int n,r=3,result;
	PermutCombin()
	{
		System.out.println("Enter size of list");
		n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
			numbers.add(sc.nextInt());
		display();
		result = fact(n) / fact(n-r);
		System.out.println("Permutation: "+result);
		result = fact(n) / (fact(r) * fact(n-r));
		System.out.println("Combination: "+result);
	}
	public int fact(int num)
	{
		int f=1,j=1;
		while(j <= num)
		{
			 f=f*j;
			 j++;
		}
		return f;
	}
	public void display()
	{
		System.out.println(numbers);
	}
	
	public static void main(String[] args) 
	{
		new PermutCombin();
	}

}
