package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q20_ValidParantheses {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String s = st.nextToken();
		System.out.println(isValid(s));
	}

	public static boolean isValid(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (ch == ')') {
				if (stack.isEmpty() || stack.peek() != '(')
					return false;
				else
					stack.pop();
			} else if (ch == '}') {
				if (stack.isEmpty() || stack.peek() != '{')
					return false;
				else
					stack.pop();
			} else if (ch == ']') {
				if (stack.isEmpty() || stack.peek() != '[')
					return false;
				else
					stack.pop();
			} else
				stack.push(ch);
		}
		if (stack.isEmpty())
			return true;
		else
			return false;
	}
}
