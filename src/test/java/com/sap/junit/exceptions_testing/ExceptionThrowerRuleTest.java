package com.sap.junit.exceptions_testing;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class ExceptionThrowerRuleTest {
	private ExceptionsThrower et = new ExceptionsThrower();
	
	@Rule
	public ExpectedException thrown = ExpectedException.none();

	@Test
	public void testExceptionMessage() throws IndexOutOfBoundsException {
	    thrown.expect(IndexOutOfBoundsException.class);
	    thrown.expectMessage("Index: 0, Size: 0");
	    et.throwIndexOutOfBoundsException(); // execution will never get past this line
	}
	
	@Test
	public void testSomeOtherException() throws RuntimeException {
	    thrown.expect(RuntimeException.class);
	    thrown.expectMessage("Runtime exception message");
	    et.throwRuntimeException(); // execution will never get past this line
	}
}
