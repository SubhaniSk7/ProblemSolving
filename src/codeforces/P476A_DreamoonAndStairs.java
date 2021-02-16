package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P476A_DreamoonAndStairs {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		sol(n, m);
	}

	public static void sol(int n, int m) {
		int maxSteps = n, i = 1;
		int minSteps = (n + 1) / 2;
		boolean found = false;
		for (i = minSteps; i <= maxSteps; ++i) {
			if (i % m == 0) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println(i);
		} else {
			System.out.println(-1);
		}
	}
}
