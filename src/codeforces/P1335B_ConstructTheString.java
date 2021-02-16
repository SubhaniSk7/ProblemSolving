package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1335B_ConstructTheString {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()),
					b = Integer.parseInt(st.nextToken());
			solution(n, a, b);
		}
	}

	public static void solution(int n, int a, int b) {
		char[] ch = new char[26];
		for (int i = 0; i < 26; ++i)
			ch[i] = (char) (97 + i);
		char[] ans = new char[n];
		for (int i = 0, k = 0; i < n; ++i, ++k)
			ans[i] = ch[k % b];
		for (int c = 0; c < n; c++)
			System.out.print(ans[c]);
		System.out.println();
	}
}
