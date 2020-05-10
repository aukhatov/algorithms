package art.aukhatov.algorithms.problems;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
	private ValidParentheses() {
	}

	public static boolean isValid(String str) {
		Map<Character, Character> bracketsTable = new HashMap<>();
		bracketsTable.put('}', '{');
		bracketsTable.put(']', '[');
		bracketsTable.put(')', '(');

		Stack<Character> bracketStack = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (!bracketsTable.containsKey(c)) {
				bracketStack.push(c);
			} else {
				char top = bracketStack.isEmpty() ? '?' : bracketStack.pop();
				if (top != bracketsTable.get(c)) {
					return false;
				}
			}
		}

		return bracketStack.isEmpty();
	}

	public static boolean isValid2(String str) {
		Stack<Character> brackets = new Stack<>();

		for (int i = 0; i < str.length(); i++) {
			if ('(' == str.charAt(i) || '[' == str.charAt(i) || '{' == str.charAt(i)) {
				brackets.push(str.charAt(i));
			}

			if (brackets.isEmpty()) {
				return false;
			}

			if (')' == str.charAt(i) && '(' != brackets.pop()) {
				return false;
			}

			if (']' == str.charAt(i) && '[' != brackets.pop()) {
				return false;
			}

			if ('}' == str.charAt(i) && '{' != brackets.pop()) {
				return false;
			}
		}

		return true;
	}
}
