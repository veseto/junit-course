package com.sap.junit.exceptions_testing;

import java.util.ArrayList;

public class ExceptionsThrower {

	public void throwIndexOutOfBoundsException(){
		new ArrayList<Object>().get(0);
	}
	
	public void throwRuntimeException(){
		throw new RuntimeException("Runtime exception message");
	}
}