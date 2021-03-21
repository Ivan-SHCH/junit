package by.academy.junit;

import org.junit.Assert;
import org.junit.Test;

public class TestMathCbrt extends Assert {

	@Test
	public void testCbrt() {
		assertTrue(Math.cbrt(1) == 1);
		assertTrue(Math.cbrt(8) == 2);
		assertTrue(Math.cbrt(27) == 3);
		assertTrue(Math.cbrt(125) == 5);
		assertTrue(Math.cbrt(1000) == 10);
	}
}
