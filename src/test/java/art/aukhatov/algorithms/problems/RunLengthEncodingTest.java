package art.aukhatov.algorithms.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class RunLengthEncodingTest {

	@Test
	public void compress() {
		assertEquals("A3B3R", RunLengthEncoding.compress("AAABBBR"));
		assertEquals("AB3R", RunLengthEncoding.compress("ABBBR"));
	}

	@Test
	public void longTail() {
		assertEquals("A3B3R8", RunLengthEncoding.compress("AAABBBRRRRRRRR"));
	}

	@Test
	public void oneChar() {
		assertEquals("V", RunLengthEncoding.compress("V"));
	}

	@Test
	public void singleCharSequence() {
		assertEquals("f4", RunLengthEncoding.compress("ffff"));
	}
}
