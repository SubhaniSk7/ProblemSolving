package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q1047_RemoveAllDuplicatesInString {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String S = st.nextToken();
		System.out.println(removeDuplicates(S));
	}

	public static String removeDuplicates(String S) {
		String ans = "";
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < S.length(); ++i) {
			if (!stack.isEmpty() && stack.peek() == S.charAt(i))
				stack.pop();
			else
				stack.push(S.charAt(i));
		}
//		System.out.println(stack.toString());
		while (!stack.isEmpty())
			ans = stack.pop() + ans;
		return ans;
	}
}
