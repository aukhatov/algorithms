package art.aukhatov.algorithms.problems;

public class ReverseInteger {
	private ReverseInteger() {
	}

	public static int reverse(int num) {
		int reversedNum = 0;
		boolean isNegative = num < 0;

		if (isNegative)
			num *= -1;

		while (num > 0) {
			int lastDigit = num % 10;
			reversedNum = reversedNum * 10 + lastDigit;
			num /= 10;
		}

		return isNegative ? -1 * reversedNum : reversedNum;
	}
}
