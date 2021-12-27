package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1353C_BoardMoves {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solve(n);
		}
	}

	public static void solve(int n) {
		long result = 0;
		// 1-distance:8 ; 2 distance: 2*16, 3 distance: 3*24 , ..8*((n-1)/2)^2 --> to center cell : sum of squares
		for (int i = 1; i <= n / 2; ++i)
			result += i * 1L * i;
		result *= 8;
		System.out.println(result);
	}
}
