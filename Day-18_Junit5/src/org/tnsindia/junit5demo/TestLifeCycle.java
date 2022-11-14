package org.tnsindia.junit5demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.tnsindia.junit5demo.LifeCycleMethodDemoTest.LifeCycleMethodDemo;

class TestLifeCycle implements LifeCycleMethodDemo
{
	@Test
	void fun()
	{
		System.out.println("First Test Case");
	}


	
}
