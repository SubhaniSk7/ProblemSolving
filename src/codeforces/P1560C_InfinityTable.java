package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1560C_InfinityTable {

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int k = Integer.parseInt(st.nextToken());
			solve(k);
		}
	}

	public static void solve(int k) {
		int sr = (int) Math.ceil(Math.sqrt(k));
		int row = -1, column = -1;
		if (sr * sr == k) {
			row = sr;
			column = 1;
		} else {
			int half = (2 * sr - 1) / 2;
			int prev = (int) Math.pow(sr - 1, 2);
			if (k <= prev + half) {
				row = Math.abs(prev - k);
				column = sr;
			} else {
				row = sr;
				column = sr * sr - k + 1;
			}
		}
		System.out.println(row + " " + column);
	}
}
