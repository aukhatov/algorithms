package art.aukhatov.algorithms.problems;

import static java.util.Objects.isNull;

public class Palindrome {

	private Palindrome() {
	}

	public static boolean isPalindrome(String str) {
		if (isNull(str)) {
			throw new IllegalArgumentException("The argument can't be null");
		}

		if (str.isEmpty()) {
			return true;
		}

		// There are special cases
		str = str.toLowerCase();
		str = str.replaceAll("[^a-z-0-9]", "");

		int leftIndex = 0;
		int rightIndex = str.length() - 1;

		while (leftIndex < rightIndex) {
			if (str.charAt(leftIndex) != str.charAt(rightIndex)) {
				return false;
			}
			leftIndex++;
			rightIndex--;
		}

		return true;
	}
}
