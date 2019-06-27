package com.lti.junit;

import static org.junit.Assert.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void myTest()
	{
		String expectedName="Aparna";
		assertEquals(expectedName, Employee.getEmpNameWithHighestSalary());
	}
	
	@Test
	public void myTest1()
	{
Employee expectedEmpObj=new Employee(1,"Aparna", 15000);
assertEquals(expectedEmpObj, Employee.getEmpNameWithHighestSalary());
	}

}
