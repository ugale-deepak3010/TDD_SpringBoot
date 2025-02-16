package com.TaskManager.firstTdd;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

	@Test
	public void testDevideTwoPosNumbers() {

		// arrange
		Calculator calculator = new Calculator();

		// act
		double result = calculator.devide(6, 2);

		// assert
		assertEquals(3, result);
	}

	@Test
	public void testDevidebByZero() {

		// arrange
		Calculator calculator = new Calculator();

		// assert // must be throw manually.
		assertThrows(ArithmeticException.class, () -> calculator.devide(5, 0));
	}

	@Test
	public void testDevidebByNegNum() {

		// arrange
		Calculator calculator = new Calculator();

		assertEquals(3, calculator.devide(-6, -2));
	}

}
