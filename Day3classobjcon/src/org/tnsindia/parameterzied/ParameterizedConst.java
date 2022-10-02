
package org.tnsindia.parameterzied;
import java.util.Scanner;
//demo on parameterized constructor
class bike
{
	//veriable declare
	public int speed;
	//parameterzied constructor
	bike(int s)
	{
		speed=s;
		System.out.println("The speed is:" +speed+"km/hr");
	}
	
}

public class ParameterizedConst {

	

	public static void main(String[] args) { 
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the value of speed");
	int speed=sc.nextInt();
	//object creation
	bike b=new bike(speed);
	sc.close();
		

	}

}
