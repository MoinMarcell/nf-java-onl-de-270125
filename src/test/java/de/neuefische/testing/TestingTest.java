package de.neuefische.testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TestingTest {

	// Diese Art von Tests nennt man Unit-Tests
	@Test
	void add_expectThree_whenAPlusBEqualsThree() {
		// given
		int a = 1;
		int b = 2;
		int expected = 3;
		// when
		int actual = Testing.add(a, b);
		// then
		assertEquals(expected, actual);
	}

	@Test
	void isEven_expectTrue_whenNumberIsEven(){
		// given
		int number = 2;
		// when
		boolean actual = Testing.isEven(number);
		// then
		assertTrue(actual);
	}

	@Test
	void isEven_expectFalse_whenNumberIsOdd(){
		// given
		int number = 3;
		// when
		boolean actual = Testing.isEven(number);
		// then
		assertFalse(actual);
	}

	@Test
	void product_expectSix_whenAIsTwoAndBIsThree(){
		// given
		int a = 2;
		int b = 3;
		int expected = 6;
		// when
		int actual = Testing.product(a, b);
		// then
		assertEquals(expected, actual);
	}

	@Test
	void toUpperCase_expectHELLO_whenStringIsHello(){
		// given
		String s = "hello";
		String expected = "HELLO";
		// when
		String actual = Testing.toUpperCase(s);
		// then
		assertEquals(expected, actual);
	}

	@Test
	void isPositive_expectTrue_whenNumberIsPositive(){
		// given
		int number = 1;
		// when
		boolean actual = Testing.isPositive(number);
		// then
		assertTrue(actual);
	}

	@Test
	void isPositive_expectFalse_whenNumberIsNegative(){
		// given
		int number = -1;
		// when
		boolean actual = Testing.isPositive(number);
		// then
		assertFalse(actual);
	}
}
