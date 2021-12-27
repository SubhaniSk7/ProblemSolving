package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1614A_DivanAndAStore {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			long k = Long.parseLong(st.nextToken());
			st = new StringTokenizer(br.readLine());
			long[] a = new long[n];
			for (int i = 0; i < n; ++i)
				a[i] = Long.parseLong(st.nextToken());
			solve(n, l, r, k, a);
		}
	}

	public static void solve(int n, int l, int r, long k, long[] a) {
		Arrays.sort(a);
		int chocolates = 0;
		for (int i = 0; i < n; ++i) {
			if (a[i] < l) {
				continue;
			} else if (a[i] <= r) {
				if (k - a[i] < 0)
					break;
				chocolates++;
				k -= a[i];
			}
		}
		System.out.println(chocolates);
	}
}
