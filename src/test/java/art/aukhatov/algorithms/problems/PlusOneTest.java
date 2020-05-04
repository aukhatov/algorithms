package art.aukhatov.algorithms.problems;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class PlusOneTest {

	@Test
	public void shouldReturnCorrectResult() {
		int[] arr = new int[]{1, 2, 3};
		int[] expectedArr = new int[]{1, 2, 4};
		assertArrayEquals(expectedArr, PlusOne.solution(arr));
	}

	@Test
	public void shouldReturnCorrectResultInCornerCase() {
		int[] arr = new int[]{9, 9, 9};
		int[] expectedArr = new int[]{1, 0, 0, 0};
		assertArrayEquals(expectedArr, PlusOne.solution(arr));
	}
}