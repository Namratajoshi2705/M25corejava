package com.org.tns.indiacustomexception;

public class SimpleCustomExceptionExecutor 
{

	public static void main(String[] args) {
		/* In order to use our own custom exception,we've to create a new object of the class
		 * and throw it using the throw keyword
		 */
		try 
		{
			throws new SimpleCustomException("User-Defined Exception Demo");
			
			
		}
		catch(SimpleCustomException e)
		{
			System.out.println(e);
			
		}

	}




	}


