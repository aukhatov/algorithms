package art.aukhatov.algorithms.problems;

import org.junit.Test;

import static org.junit.Assert.*;

public class TwoSumTest {

	@Test
	public void solution() throws Exception {
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		assertArrayEquals(new int[] {0, 1}, TwoSum.solution(nums, target));
	}
}