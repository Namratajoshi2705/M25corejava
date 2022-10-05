package com.tns.Looping;

import java.util.Scanner;

public class Pattern_1 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=sc.nextInt();
		System.out.println("enter the col");
		int col=sc.nextInt();
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=col;j++)
			{
				if(i>j)
				{
					System.out.print("@");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
			sc.close();
		}
		
	}

}
