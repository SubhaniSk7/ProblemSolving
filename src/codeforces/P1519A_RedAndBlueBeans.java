package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1519A_RedAndBlueBeans {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int r = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());
			solve(r, b, d);
		}
		System.out.println(sb.toString());
	}

	public static void solve(int r, int b, int d) {
		int max = Math.max(r, b), min = Math.min(r, b);
		long val = min * 1L * (d + 1);
		if (max <= val)
			sb.append("YES\n");
		else
			sb.append("NO\n");
	}
}
