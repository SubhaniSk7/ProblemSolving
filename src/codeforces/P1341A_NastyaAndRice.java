package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1341A_NastyaAndRice {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
					c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			solve(n, a, b, c, d);
		}
		System.out.println(sb.toString());
	}

	public static void solve(int n, int a, int b, int c, int d) {
		int min = n * (a - b), max = n * (a + b);
		if (c + d < min || max < c - d)
			sb.append("NO\n");
		else
			sb.append("YES\n");
	}
}