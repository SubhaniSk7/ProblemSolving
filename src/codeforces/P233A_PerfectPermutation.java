package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P233A_PerfectPermutation {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		solve(n);
	}

	public static void solve(int n) {
		if (n % 2 == 1) {
			System.out.println(-1);
		} else {
			for (int i = 1; i <= n; ++i) {
				if (i % 2 == 1)
					System.out.print(i + 1 + " ");
				else
					System.out.print(i - 1 + " ");
			}
			System.out.println();
		}
	}
}
