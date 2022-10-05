package com.tns.decisionmaking;
import java.util.Scanner;
public class Example_4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char a=sc.next().charAt(0);
		switch(a)
		{
		case 'a':
			System.out.println("Apple");
			break;
		case 'b':
			System.out.println("Ball");
			break;
		case 'c':
			System.out.println("cat");
			break;
		case 'd':
			System.out.println("Dog");
			break;
			default:
				System.out.println("invaild input");
				sc.close();
				
			
			
		}

	}

}
