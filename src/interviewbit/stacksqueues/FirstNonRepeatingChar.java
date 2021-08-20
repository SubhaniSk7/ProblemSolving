package interviewbit.stacksqueues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class FirstNonRepeatingChar {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String A = br.readLine();
		System.out.println(firstNon(A));
	}

	public static String firstNon(String A) {
		Queue<Character> q = new LinkedList<Character>();
		int n = A.length();
		int[] count = new int[26];
		StringBuffer first = new StringBuffer("");
		for (int i = 0; i < n; ++i) {
			char ch = A.charAt(i);
			q.offer(ch);
			count[ch - 'a']++;
			while (!q.isEmpty()) {
				if (count[q.peek() - 'a'] > 1)
					q.poll();
				else {
					first.append(q.peek());
					break;
				}
			}
			if (q.isEmpty())
				first.append('#');
		}
		String result = first.toString();
		return result;
	}
}
