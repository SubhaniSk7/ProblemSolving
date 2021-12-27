package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1607A_LinearKeyboard {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s = br.readLine();
			String word = br.readLine();
			solve(s, word);
		}
	}

	public static void solve(String s, String word) {
		int[] chars = new int[26];
		int index = 0;
		for (char ch : s.toCharArray())
			chars[ch - 'a'] = index++;
		int prev = chars[word.charAt(0) - 'a'];
		int result = 0;
		for (int i = 1; i < word.length(); ++i) {
			int cur = chars[word.charAt(i) - 'a'];
			result += Math.abs(cur - prev);
			prev = cur;
		}
		System.out.println(result);
	}

}
