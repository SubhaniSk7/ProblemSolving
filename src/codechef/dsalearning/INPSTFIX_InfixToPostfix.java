package codechef.dsalearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class INPSTFIX_InfixToPostfix {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();

			convert(s);
		}
	}

	public static void convert(String s) {
		String postfix = "";

		HashMap<Character, Integer> precedence = new HashMap<>();
		precedence.put('(', 0);
		precedence.put('+', 1);
		precedence.put('-', 1);
		precedence.put('*', 2);
		precedence.put('/', 2);
		precedence.put('^', 3);

		Stack<Character> exp = new Stack<Character>();
		for (int i = 0; i < s.length(); ++i) {
			char ch = s.charAt(i);
			if (Character.isLetter(ch)) {
				postfix += ch;
			} else if (ch == '(')
				exp.push(ch);
			else if (ch == ')') {
				while (!exp.isEmpty()) {
					char pop = exp.pop();
					if (pop == '(')
						break;
					postfix += pop;
				}
			} else {
				while (!exp.isEmpty() && precedence.get(ch) <= precedence.get(exp.peek()))
					postfix += exp.pop();
				exp.push(ch);
			}
		}
		while (!exp.isEmpty())
			postfix += exp.pop();

		System.out.println(postfix);
	}
}
