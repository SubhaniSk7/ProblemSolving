package interviewbit.stacksqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BalacedParanthesis {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();// only contains (,)
		System.out.println(solve(A));
	}

	public static int solve(String A) {// if balanced return 1, else 0
		int result = 1;
		Stack<Character> s = new Stack<Character>();
		for (int i = 0; i < A.length(); ++i) {
			char ch = A.charAt(i);
			if (ch == ')') {
				if (s.isEmpty())
					return 0;
				else
					s.pop();
			} else
				s.push(ch);
		}
		if (!s.isEmpty())
			return 0;
		return result;
	}
}
