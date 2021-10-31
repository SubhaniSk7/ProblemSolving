package leetproblems;

import java.util.Stack;

public class Q402_RemoveKDigits {
	public String removeKdigits(String num, int k) {
		int n = num.length();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < n; ++i) {
			char ch = num.charAt(i);
			while (k > 0 && !stack.isEmpty() && stack.peek() > ch) {
				stack.pop();
				k--;
			}
			stack.push(ch);
		}

		while (k > 0) {
			stack.pop();
			k--;
		}
		StringBuilder sb = new StringBuilder();
		while (!stack.isEmpty()) {
			char ch = stack.pop();
			sb.append(ch);
		}
		sb.reverse();
		while (sb.length() > 1 && sb.charAt(0) == '0') {
			sb.deleteCharAt(0);
		}
		if (sb.length() == 0)
			return "0";
		return sb.toString();
	}
}
