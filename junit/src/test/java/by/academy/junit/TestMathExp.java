package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestMathExp extends Assert {

	@Test
	public void testExp() {
		assertTrue(Math.exp(1) == 2.718281828459045);
		assertTrue(Math.exp(2) == 7.38905609893065);
		assertTrue(Math.exp(3) == 20.085536923187668);

	}
}
