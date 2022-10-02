
package org.tnsindia.defaultcons;
//class defination
class car
{
	//variable
	public int speed;
	//method
	void display()
	{
		System.out.println("the speed is: " +speed+"km/hr");
	}
	//default constructor
	//constructor is used to intialize the value of the veriable
	car()
	{
		speed=50;
		
	}
}

public class DefaultConst {
	

	public static void main(String[] args)
	{
		//object create
		car obj=new car();
		//obj.speed=50;
		//calling the method of car class
		obj.display();
		
		
	}

}
