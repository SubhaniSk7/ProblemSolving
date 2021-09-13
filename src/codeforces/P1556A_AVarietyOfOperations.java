package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1556A_AVarietyOfOperations {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int c = Integer.parseInt(st.nextToken()), d = Integer.parseInt(st.nextToken());

			solve(c, d);
		}
	}

	public static void solve(int c, int d) {
		int s = c + d;
		if (s == 0) {
			System.out.println(0);
			return;
		}
		if (s % 2 == 0) {
			if (c == s / 2 && d == s / 2)
				System.out.println(1);
			else
				System.out.println(2);
		} else {
			System.out.println(-1);
		}
	}
}
