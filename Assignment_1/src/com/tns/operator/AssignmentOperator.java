package com.tns.operator;

import java.util.Scanner;

public class AssignmentOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number");
		int a= sc.nextInt();
		int b=sc.nextInt();
		a*=b; //a=a*b
		System.out.println(a);
		sc.close();

	}

}
