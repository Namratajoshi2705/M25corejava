package com.tns.decisionmaking;

public class Example_3 {
//nested if else if(jumping)
	public static void main(String[] args) 
	{
		int age=15,weight=56;
		if(age>=12)
		{
			if(weight>=40)
			{
				if(weight<=110)
				{
					System.out.println("eligible for bunjee jumping");
				}
				else 
				{
					System.out.println("extra rupee will be added");
				}
			}
				else
				{
					System.out.println("NOt eligible for bunjee jumping");
			    }
			}
		else
		{
			System.out.println("not eligible for bunjee jumping");
		}
	}

}
