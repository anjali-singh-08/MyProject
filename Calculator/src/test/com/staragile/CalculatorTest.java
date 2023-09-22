package com.staragile;
import junit.framework.Assert;
import org.junit.Test;
public class CalculatorTest {
	@Test
	public void testSum() {
		// Given
		Calculator calculator = new Calculator();
		// When
		int result = calculator.add(2, 2);
		// Then
		if (result != 4) {   // if 2 + 2 != 4
			Assert.fail();
		}
	}

	@Test
	public void testMinus() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(0, calculator.sub(2, 2));
	}

	@Test
	public void testDivide() {
		Calculator calculator = new Calculator();
		Assert.assertEquals(2, calculator.div(6, 3));
	}

	@Test(expected = ArithmeticException.class)
	public void testDivideWillThrowExceptionWhenDivideOnZero() {
		Calculator calculator = new Calculator();
		calculator.div(6, 0);
	}
}
