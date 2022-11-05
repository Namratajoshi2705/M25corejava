package com.org.tns.indiacustomexception;

public class SimpleCustomException {
	public String str;

	//constructor
	public SimpleCustomException(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "SimpleCustomException [str=" + str + "]";
	}
	
	
}



