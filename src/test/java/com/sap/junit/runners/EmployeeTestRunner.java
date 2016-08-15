package com.sap.junit.runners;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.sap.junit.simpletest.EmployeeDetailsTest;
 
public class EmployeeTestRunner {
	public static void main(String[] args) {
	      Result result = JUnitCore.runClasses(EmployeeDetailsTest.class);
			
	      for (Failure failure : result.getFailures()) {
	         System.out.println(failure.toString());
	      }
			
	      System.out.println(result.wasSuccessful());
	   }
}