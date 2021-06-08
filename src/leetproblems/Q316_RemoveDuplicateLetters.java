package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Stack;

public class Q316_RemoveDuplicateLetters {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		System.out.println(removeDuplicateLetters(s));
	}

	public static String removeDuplicateLetters(String s) {
		String ans = "";
		int n = s.length();
		Stack<Character> stack = new Stack<Character>();
		HashMap<Character, Integer> freq = new HashMap<Character, Integer>();
		HashMap<Character, Boolean> visited = new HashMap<Character, Boolean>();
		for (int i = 0; i < n; ++i)
			freq.put(s.charAt(i), freq.getOrDefault(s.charAt(i), 0) + 1);
		for (int i = 0; i < n; ++i) {
			char ch = s.charAt(i);
			while (!stack.isEmpty() && stack.peek() > ch && freq.get(stack.peek()) != 0
					&& !visited.getOrDefault(ch, false)) {
				visited.put(stack.peek(), false);
				stack.pop();
			}
			if (!visited.getOrDefault(ch, false))
				stack.push(ch);
			visited.put(ch, true);
			freq.put(ch, freq.getOrDefault(ch, 0) - 1);
			System.out.println(freq.toString() + " " + stack.toString());
		}
		while (!stack.isEmpty())
			ans = stack.pop() + ans;
		return ans;
	}
}
