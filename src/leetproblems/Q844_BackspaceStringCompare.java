package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Q844_BackspaceStringCompare {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		String S = st.nextToken(), T = st.nextToken();
		System.out.println(backspaceCompare(S, T));
	}

	public static boolean backspaceCompare(String S, String T) {
		Stack<Character> s = new Stack<Character>(), t = new Stack<Character>();
		for (int i = 0; i < S.length(); ++i) {
			if (S.charAt(i) == '#') {
				if (s.isEmpty())
					continue;
				s.pop();
			} else
				s.push(S.charAt(i));
		}
		for (int i = 0; i < T.length(); ++i) {
			if (T.charAt(i) == '#') {
				if (t.isEmpty())
					continue;
				t.pop();
			} else
				t.push(T.charAt(i));
		}
		String a = "", b = "";
		while (!s.isEmpty())
			a += s.pop();
		while (!t.isEmpty())
			b += t.pop();
		return a.equals(b) ? true : false;
	}
}
