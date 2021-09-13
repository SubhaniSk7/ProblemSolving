package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IN_P1567B_MEXorMixup {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
			solve(a, b);
		}
	}

	public static void solve(int a, int b) {
		int ans = 0;
		if (b == 0) {
			ans = 2 * a - 1;
		} else if (b == a)
			ans = 2 * a - 1 + 2;
		else if (b < a) {
			ans = 2 * a - 2;
		} else if (b > a) {
			ans = a + 1;
		}
		System.out.println(ans);
	}
}
