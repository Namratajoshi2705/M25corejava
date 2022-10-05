package com.tns.operator;

import java.util.Scanner;

public class IncrementOperator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int x=a++;// post increment operator
		int y=++b;// pre
		int z=a+x;
		int p=a--; //post decrement operator
		int q=--b; //pre decrement
		int r=a-p;
		
		System.out.println(z);
		System.out.println(r);
		
	}

}
