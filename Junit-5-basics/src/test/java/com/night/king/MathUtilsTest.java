/**
 * 
 */
package com.night.king;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

/**
 * @author Night King
 *
 */
class MathUtilsTest {

	@Test
	void testAdd() {
//		fail("Not yet implemented");
//		System.out.println("This is test run");
		MathUtils mathUtils=new MathUtils();
		
		int expected =2;
		int actual = mathUtils.add(1, 1);
		
//		assertEquals(expected, actual);
		assertEquals(expected, actual, "The add method should add two numbers");
		
	}
	 
	@Test
	void testCalculateCircleArea() {
		MathUtils mathUtils=new MathUtils();
		
		assertEquals(314.1592653589793, mathUtils.calculateCircleArea(10), "Should return right circle area");
	}
	
	@Test
	void testDivide() {
		MathUtils mathUtils=new MathUtils();
		
//		assertThrows(NullPointerException.class, () -> mathUtils.divide(1,0), "divide by zero should throw");

		assertThrows(ArithmeticException.class, () -> mathUtils.divide(1,0), "divide by zero should throw");
	}
}
 