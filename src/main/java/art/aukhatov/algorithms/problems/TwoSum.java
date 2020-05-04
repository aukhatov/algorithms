package art.aukhatov.algorithms.problems;

import art.aukhatov.algorithms.problems.exception.SolutionNotFoundException;

import java.util.HashMap;
import java.util.Map;

/**
 * Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 * </p>
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 * Example:
 * <p>
 * Given nums = [2, 7, 11, 15], target = 9,
 * <p>
 * Because nums[0] + nums[1] = 2 + 7 = 9,
 * return [0, 1].
 */
public class TwoSum {

	private TwoSum() {
	}

	public static int[] solution(int[] numbers, int target) throws SolutionNotFoundException {
		Map<Integer, Integer> table = new HashMap<>();
		for (int i = 0; i < numbers.length; i++) {
			table.put(numbers[i], i);
		}

		for (int i = 0; i < numbers.length; i++) {
			int sum = target - numbers[i];
			if (table.containsKey(sum) && table.get(sum) != i) {
				return new int[]{i, table.get(sum)};
			}
		}

		throw new SolutionNotFoundException("Couldn't find a solution for Two Sum problem");
	}
}
