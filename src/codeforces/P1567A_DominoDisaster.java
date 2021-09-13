package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1567A_DominoDisaster {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] a = new int[2][n];
//		StringTokenizer st = new StringTokenizer(br.readLine());
			String s = br.readLine();
			solve(n, s);
		}
	}

	public static void solve(int n, String s) {
		String ans = "";
		for (int i = 0; i < n; ++i) {
			char ch = s.charAt(i);
			if (ch == 'U') {
				ans += "D";
			} else if (ch == 'L') {
				ans += "L";
			} else if (ch == 'R') {
				ans += "R";
			} else if (ch == 'D') {
				ans += 'U';
			}
		}
		System.out.println(ans);
	}
}
