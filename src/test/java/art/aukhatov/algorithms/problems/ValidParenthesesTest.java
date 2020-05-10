package art.aukhatov.algorithms.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
	@Test
	public void valid() {
		assertTrue(ValidParentheses.isValid("{[()]}"));
	}

	@Test
	public void invalid() {
		assertFalse(ValidParentheses.isValid("{)]}"));
	}

	@Test
	public void isRegular() {
		assertTrue(ValidParentheses.isValid2("{[()]}"));
	}
}