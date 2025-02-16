package com.TaskManager.firstTdd;

public class Calculator {

	public double devide(double a, double b) {

		if (b == 0 || a == 0) {
			throw new ArithmeticException("First or second parameter is 0");// for test cases must be manually thrown
		}

		return a / b;
	}

}
