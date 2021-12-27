package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class P1374C_MoveBrackets {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			solve(n, s);
		}
	}

	public static void solve(int n, String s) {
		Stack<Character> stack = new Stack<>();
		for (char ch : s.toCharArray()) {
			if (ch == '(') {
				stack.push(ch);
			} else {
				if (!stack.isEmpty() && stack.peek() == '(')
					stack.pop();
				else
					stack.push(ch);
			}
		}
		System.out.println(stack.size() / 2);
	}
}
