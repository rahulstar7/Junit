package com.junit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.junit.calculator.Calculator;

@SpringBootApplication
public class CalculatorApplication {

	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);

		Calculator calculator = new Calculator();

		int sub = calculator.sub(15, 5);
		int div = calculator.div(45, 5);
		int sum = calculator.sum(45, 45);
		int mul = calculator.mul(45, 8);
		
		System.out.println(sub);
		System.out.println(sum);
		System.out.println(mul);
		System.out.println(div);
		
		
		
		
		
	}

	public String getMsgfirst()
	{
		
		return "Welcome to the Bikkad IT";
	}
	

//stash demo
	public String getMsgSecond()
	{
		
		return "Welcome to the Bikkad IT";
	}
	
	
	
	

	public String getMsgthird()
	{
		
		return "Welcome to the Bikkad IT";
	}
}
