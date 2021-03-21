package by.academy.junit;

import org.junit.Test;
import java.util.Arrays;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class DivideTestCalc extends Assert {
	private int valueA;
	private int valueB;
	private int expected;

	public DivideTestCalc(int valueA, int valueB, int expected) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
		this.expected = expected;
	}

	@Parameterized.Parameters(name = "{index}:divideOf({0}/{1})={2}")
	public static Iterable<Object[]> dataForTest() {
		return Arrays
				.asList(new Object[][] { { 12, 1, 12 }, { 228, 12, 19 }, { 6, 2, 3 }, { 10, 10, 1 }, { 32, 2, 16 } });
	}

	@Test
	public void paramTest() {
		assertEquals(expected, Calculator.getDivide(valueA, valueB));
	}

}
