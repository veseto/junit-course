package com.sap.junit.simple;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class EmployeeDetailsTest {
	EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
	EmployeeDetails employee = new EmployeeDetails();

	@Test
	public void testCalculateAppriasal() {
		employee.setName("Silviya");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		double appraisal = empBusinessLogic.calculateAppraisal(employee);
		assertEquals(500, appraisal, 0.0);
	}

	@Test
	public void testCalculateYearlySalary() {
		employee.setName("Silviya");
		employee.setAge(25);
		employee.setMonthlySalary(8000);
		double salary = empBusinessLogic.calculateYearlySalary(employee);
		assertEquals(96000, salary, 0.0);
	}
}