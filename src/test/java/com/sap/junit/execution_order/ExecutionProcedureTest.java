package com.sap.junit.execution_order;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class ExecutionProcedureTest {

	// execute only once, in the starting
	@BeforeClass
	public static void beforeClass() {
		System.out.println("before class");
	}

	// execute only once, in the end
	@AfterClass
	public static void afterClass() {
		System.out.println("after class");
	}

	// execute for each test, before executing test
	@Before
	public void before() {
		System.out.println("before");
	}

	// execute for each test, after executing test
	@After
	public void after() {
		System.out.println("after");
	}

	// test case 1
	@Test
	public void test1() {
		System.out.println("test 1");
	}

	// test case 2
	@Test
	public void test2() {
		System.out.println("test 2");
	}
}
