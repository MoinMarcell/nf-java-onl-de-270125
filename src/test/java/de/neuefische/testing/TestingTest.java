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
}
