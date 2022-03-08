package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1551B1_WonderfulColoring_1 {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s = br.readLine();
			solve(s);
		}
		System.out.println(sb.toString());
	}

	public static void solve(String s) {
		int[] freq = new int[26];
		for (char ch : s.toCharArray())
			freq[ch - 'a']++;
		int k = 0, unique = 0;
		for (int i = 0; i < 26; ++i) {
			if (freq[i] >= 2)
				k++;
			else if (freq[i] == 1)
				unique++;
		}
		k += (unique / 2);
		sb.append(k + "\n");
	}
}
