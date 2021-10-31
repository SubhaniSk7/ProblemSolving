package leetproblems;

import java.util.Stack;

public class Q394_DecodeString {
//	public String decodeString(String s) {
//		Stack<String> result = new Stack<>();
//		Stack<Integer> multiple = new Stack<>();
//		int ptr = 0, n = s.length();
//		String str = "";
//		while (ptr < n) {
//			char ch = s.charAt(ptr);
//			if (Character.isDigit(ch)) {
//				int num = 0;
//				while (Character.isDigit(s.charAt(ptr))) {
//					num = num * 10 + (s.charAt(ptr) - '0');
//					ptr++;
//				}
//				multiple.push(num);
//			} else if (ch == '[') {
//				result.push(str);
//				str = "";
//				ptr++;
//			} else if (ch == ']') {
//				StringBuilder sb = new StringBuilder(result.pop());
//				int num = multiple.pop();
//				for (int i = 0; i < num; ++i)
//					sb.append(str);
//				str = sb.toString();
//				ptr++;
//			} else {
//				str += ch;
//				ptr++;
//			}
//		}
//		return str;
//	}

	public String decodeString_1(String s) {
		Stack<String> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch != ']') {
				stack.push("" + ch);
			} else {
				String str = "";
				while (!stack.isEmpty() && stack.peek() != "[")
					str = stack.pop() + str;
				stack.pop();// popping '['

				String num = "";
				while (!stack.isEmpty() && Character.isDigit(stack.peek().charAt(0)))
					num = stack.pop() + num;

				StringBuilder sb = new StringBuilder();
				for (int k = 1; k < Integer.parseInt(num); ++k)
					sb.append(str);
				stack.push(sb.toString());
			}
		}
		String result = "";
		while (!stack.isEmpty())
			result = stack.pop() + result;
		return result;
	}
}
