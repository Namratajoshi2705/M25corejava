package com.org.tns.indiacustomexception;

public class UserLoginCustomExceptionDemo {
	class LoginCredentials extends Exception
	{
		public String str;

		//constructor
		public LoginCredentials(String str) {
			super();
			this.str = str;
		}

		@Override
		public String toString() {
			return "LoginCredentials [str=" + str + "]";
		}
	}



}
