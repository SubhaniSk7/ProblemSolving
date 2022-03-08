package leetproblems;

import java.util.Stack;

public class Q32_LongestValidParentheses {
	public int longestValidParentheses(String s) {
		int max = 0;
		Stack<int[]> stack = new Stack<>();
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (ch == '(') {
				stack.push(new int[] { 1, i });
			} else {
				if (stack.isEmpty()) {
					stack.push(new int[] { -1, i });
				} else {
					if (stack.peek()[0] == 1) {
						stack.pop();
						if (stack.isEmpty())
							max = Math.max(max, i + 1);
						else
							max = Math.max(max, i - stack.peek()[1]);
					} else {
						stack.push(new int[] { -1, i });
					}
				}
			}
		}
		return max;
	}
}
