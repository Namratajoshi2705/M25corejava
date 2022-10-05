package com.tns.decisionmaking;
import java.util.Scanner;
public class Example_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the three number");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b && a>c)
			
		{
			System.out.println(a);
		}
		else if(b>a && b>c)
		{
			System.out.println(b);
		}
		else
		{
			System.out.println(c);
		}

	}

}
