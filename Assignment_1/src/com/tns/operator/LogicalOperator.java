package com.tns.operator;

import java.util.Scanner;

public class LogicalOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a two number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		boolean res1=(a>b && b<a);
		boolean res2=(a<b || b<a);
		boolean res3=!(a<b);
		
		System.out.println(res1);
		System.out.println(res2);
		System.out.println(res3);
		
	}

}
