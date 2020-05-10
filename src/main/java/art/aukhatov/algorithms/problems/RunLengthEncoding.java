package art.aukhatov.algorithms.problems;

import static java.util.Objects.isNull;

public class RunLengthEncoding {

	private RunLengthEncoding() {
	}

	public static String compress(String str) {

		if (isNull(str) || str.isEmpty()) {
			throw new IllegalArgumentException("Input string is required");
		}

		String encoded = "";
		int length = 1;
		char current = str.charAt(0);

		for (int i = 1; i < str.length(); i++) {
			if (current == str.charAt(i)) {
				length++;
			} else {
				encoded += length > 1 ? current + String.valueOf(length) : current;
				current = str.charAt(i);
				length = 1;
			}
		}

		encoded += length > 1 ? current + String.valueOf(length) : current;

		return encoded;
	}
}
