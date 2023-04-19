package com.junit.calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CalculatorTest {


	@Test
	public void sumTest()
	{
		Calculator calculator = new Calculator();
		
		int actualresult = calculator.sum(45, 45);
		
		int expectedresult=90;
		
		assertEquals(expectedresult, actualresult);
		
	}
	
	
	
	@Test
	public void subtest()
	{
		Calculator calculator = new Calculator();
		
		int actualresult = calculator.sub(10, 5);
		
		int expectedresult=5;
		
		assertEquals(expectedresult, actualresult);
		
	}
	
	
	
	
	
	
	
	
	
	@Test
	public void multest()
	{
		
		Calculator calculator = new Calculator();
		
		int actualresult = calculator.mul(10, 10);
		
		
		int expectedresult=10;
		
		
		assertEquals(expectedresult, actualresult);
	}
	
	public String getMsg()
	{
	  return "this is stash";
	}
	
	
	
	
	
	@Test
	public void divtest()
	{
		
		Calculator calculator = new Calculator();
		
		int actualresult = calculator.div(10, 2);
		
		
		int expectedresult=5;
		
		
		assertEquals(expectedresult, actualresult);
	}
		
	
	
	
	
	
	
	
	
}
