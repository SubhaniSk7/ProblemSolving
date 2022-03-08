package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1521A_NastiaandNearlyGoodNumbers {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken());
			solve(a, b);
		}
		System.out.println(sb.toString());
	}

	public static void solve(long a, long b) {
		if (b == 1) {
			sb.append("NO\n");
		} else {
			sb.append("YES\n");
			sb.append(a + " " + (a * b) + " " + (a * (b + 1)) + "\n");
		}
	}
}
