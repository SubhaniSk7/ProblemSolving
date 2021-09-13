package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P520B_TwoButtons {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		solve(n, m);
	}

	public static void solve(int n, int m) {
		int steps = 0;
		while (m > n) {
			if (m % 2 == 0)
				m /= 2;
			else
				m++;
			steps++;
		}
		steps += n - m;
		System.out.println(steps);
	}
}
