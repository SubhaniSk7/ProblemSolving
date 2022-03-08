package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1352B_SameParitySummands {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			solve(n, k);
		}
		System.out.println(sb.toString());
	}

	public static void solve(int n, int k) {
		if (n < k) {
			sb.append("NO\n");
		} else if (n == k) {
			sb.append("YES\n");
			for (int i = 0; i < n; ++i)
				sb.append("1 ");
			sb.append("\n");
		} else {
			if (n % 2 == 0) {
				if (k > n / 2) {
					if (k % 2 == 0) {
						sb.append("YES\n");
						for (int i = 0; i < k - 1; ++i)
							sb.append("1 ");
						int val = n - k + 1;
						sb.append(val + "\n");
					} else
						sb.append("NO\n");
				} else {
					sb.append("YES\n");
					for (int i = 0; i < k - 1; ++i)
						sb.append("2 ");
					int val = n - (2 * (k - 1));
					sb.append(val + "\n");
				}
			} else {
				if (k % 2 == 0) {
					sb.append("NO\n");
				} else {
					sb.append("YES\n");
					for (int i = 0; i < k - 1; ++i)
						sb.append("1 ");
					int val = n - k + 1;
					sb.append(val + "\n");
				}
			}
		}
	}
}
