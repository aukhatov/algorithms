package art.aukhatov.algorithms.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

	@Test
	public void reversePositiveNumber() {
		assertEquals(321, ReverseInteger.reverse(123));
	}

	@Test
	public void reverseNegativeNumber() {
		assertEquals(-321, ReverseInteger.reverse(-123));
	}
}