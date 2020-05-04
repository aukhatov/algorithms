package art.aukhatov.algorithms.problems;

/**
 * Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
 * <p>
 * The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
 * <p>
 * You may assume the integer does not contain any leading zero, except the number 0 itself.
 * <p>
 * Example 1:
 * <p>
 * Input: [1,2,3]
 * Output: [1,2,4]
 * Explanation: The array represents the integer 123.
 */
public class PlusOne {

	private PlusOne() {
	}

	public static int[] solution(int[] digits) {
		int i = digits.length - 1;

		while (digits[i] == 9) {
			digits[i] = 0;
			i--;
			if (i <= 0) {
				digits = new int[digits.length + 1];
				digits[0] = 1;
				break;
			}
		}

		if (i > 0) {
			digits[i]++;
		}

		return digits;
	}
}
