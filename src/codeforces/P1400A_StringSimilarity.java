package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1400A_StringSimilarity {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			solve(n, s);
		}
	}

	public static void solve(int n, String s) {
		char[] ch = s.toCharArray();
		StringBuilder sb = new StringBuilder();
//		for (int i = 0, k = 0; i < s.length() - n + 1; ++i) {
//			sb.append("" + ch[i + k]);
//			k++;
//		}
		for (int i = 0; i < s.length(); i += 2)
			sb.append("" + ch[i]);
		System.out.println(sb.toString());
	}
}
