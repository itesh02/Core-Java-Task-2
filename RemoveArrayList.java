package com.cetpa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RemoveArrayList 
{
	Scanner sc=new Scanner(System.in);
	List<Integer> arrayList = new ArrayList<>();
	int n,index;
	RemoveArrayList()
	{
		System.out.println("Enter size of list");
		n=sc.nextInt();
		System.out.println("Enter elements");
		for(int i=0;i<n;i++)
		{
			arrayList.add(sc.nextInt());
		}
		display();
		remove1();
		display();
	}
	public void remove1()
	{
		System.out.println("Enter index of the element to remove");
		index = sc.nextInt();
		arrayList.remove(index);
	}
	public void display()
	{
		System.out.println(arrayList);
	}
	public static void main(String[] args) 
	{
		new RemoveArrayList();
	}

}
