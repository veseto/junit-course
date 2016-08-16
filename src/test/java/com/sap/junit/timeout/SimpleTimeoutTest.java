package com.sap.junit.timeout;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleTimeoutTest {

	@Ignore
	@Test(timeout = 1000)
	public void testWithTimeout() {
		while (true) {
			assertTrue(true);
		}
	}
}