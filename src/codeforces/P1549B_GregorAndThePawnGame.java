package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1549B_GregorAndThePawnGame {
	public static char[][] chess;
	public static int n;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			n = Integer.parseInt(br.readLine());
			chess = new char[2][n];
			for (int i = 0; i < 2; ++i) {
				String s = br.readLine();
				for (int j = 0; j < n; ++j)
					chess[i][j] = s.charAt(j);
			}
			solve();
		}
	}

	public static void solve() {
		int count = 0;
		for (int i = 0; i < n; ++i) {
			if (chess[1][i] == '1') {
				int leftdiag = i - 1, straight = i, rightdiag = i + 1;
				if (chess[0][straight] == '0') {
					count++;
				} else if (leftdiag >= 0 && chess[0][leftdiag] == '1') {
					count++;
					chess[0][leftdiag] = 'a';
				} else if (rightdiag < n && chess[0][rightdiag] == '1') {
					count++;
					chess[0][rightdiag] = 'a';
				}
			}
		}
		System.out.println(count);
	}
}
