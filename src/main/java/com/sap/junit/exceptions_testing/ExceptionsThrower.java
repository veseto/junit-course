package com.sap.junit.exceptions_testing;

import java.util.ArrayList;

public class ExceptionsThrower {

	public void throwIndexOutOfBoundsException(){
		ArrayList<Object> al = new ArrayList<Object>();
		al.get(0);
	}
	
	public void throwRuntimeException(){
		throw new RuntimeException("Runtime exception message");
	}
}