package leetproblems;

public class Q1963_MinimumNumberOfSwapsToMakeTheStringBalanced {
	public int minSwaps(String s) {
		int close = 0, maxClose = 0;
		for (char ch : s.toCharArray()) {
			if (ch == '[')
				close--;
			else
				close++;
			maxClose = Math.max(close, maxClose);
		}
		return (maxClose + 1) / 2;
	}

//	public int minSwaps_2(String s) {
//		int open = 0, close = 0, openIndex = s.length() - 1;
//		char[] ch = s.toCharArray();
//		int count = 0;
//		for (int i = 0; i < ch.length; ++i) {
//			if (ch[i] == '[')
//				open++;
//			else
//				close++;
//			if (open < close) {
//				count++;
//				while (ch[openIndex] != '[')
//					openIndex--;
//				ch[i] = '[';
//				ch[openIndex] = ']';
//				close--;
//				open++;
//			}
//		}
//		return count;
//	}

//	public int minSwaps_1(String s) {
//		Stack<Character> stack = new Stack<>();
//		for (char ch : s.toCharArray()) {
//			if (ch == '[') {
//				stack.push(ch);
//			} else {
//				if (stack.isEmpty())
//					stack.push(ch);
//				else if (stack.peek() == '[')
//					stack.pop();
//			}
//		}
//		return stack.size() / 2;
//	}
}