package com.tns.operator;

import java.util.Scanner;

public class ReleationalOperator {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean res=a>b;
		System.out.println(res);
		sc.close();

	}

}
