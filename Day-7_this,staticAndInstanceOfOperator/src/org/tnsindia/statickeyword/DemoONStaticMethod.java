package org.tnsindia.statickeyword;

public class DemoONStaticMethod 
{
	class A
	{
		//non -static method
		int add(int a,int b)
		{
			return a+b;
		}
		//static method
		public static void display()
		{
			System.out.println("Welcome to Java Full stack training");
		}
	}


	public static void main(String[] args) {
		/*without creating any object for a class we can access that method by making
		that method as static
		className.methodname();*/
		
		A.display();
		


	}

}

