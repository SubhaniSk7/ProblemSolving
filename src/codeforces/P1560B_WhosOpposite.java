package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1560B_WhosOpposite {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken()),
					c = Integer.parseInt(st.nextToken());
			solve(a, b, c);
		}
	}

	public static void solve(int a, int b, int c) {
		int ans = -1;

		int n = Math.abs(a - b) * 2;
		if (a > n || b > n || c > n) {
			System.out.println(-1);
		} else {
			if (c > (n / 2)) {
				System.out.println(c - (n / 2));
			} else {
				System.out.println(c + (n / 2));
			}
		}
	}
}
