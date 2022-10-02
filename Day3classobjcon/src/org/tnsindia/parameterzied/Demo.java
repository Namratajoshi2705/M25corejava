package org.tnsindia.parameterzied;
// demo on default parameterized constructor
import java.util.Scanner;
class bus
{
	//veriable
	public int speed;
	//parameterized constructor
	bus(int s1)
	{
		speed=s1;
		System.out.println("The speed is:" +speed+"km/hr");
	}
	//default const
	public bus ()
	{
		System.out.println("default constructor");
	}
	
}
public class Demo {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the value of speed");
		int s1=sc.nextInt();
		//object creation
		bus b= new bus();
		bus b1=new bus(s1);
		sc.close();
		
	}

}
