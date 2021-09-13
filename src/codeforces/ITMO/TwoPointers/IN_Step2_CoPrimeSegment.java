package codeforces.ITMO.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class IN_Step2_CoPrimeSegment {
	public static int ans = Integer.MAX_VALUE;
	public static long[] a;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		a = new long[n];
		for (int i = 0; i < n; ++i)
			a[i] = Long.parseLong(st.nextToken());
		solve(n, a);
	}

	public static void solve(int n, long[] a) {
		int l = 0, i = 0;
		long result = a[0];
		for (i = 1; i < n; ++i) {
			result = gcd(result, a[i]);
			if (result == 1)
				break;
		}
		for (int r = i; r < n; ++r) {
			while (l + 1 < n && good(l + 1, r)) {
				l++;
			}
			ans = Math.min(ans, r - l + 1);
		}
		if (ans == Integer.MAX_VALUE)
			System.out.println(-1);
		else
			System.out.println(ans);
	}

	public static boolean good(int l, int r) {
		long result = a[l];
		for (int i = l + 1; i <= r; ++i) {
			result = gcd(result, a[i]);
			if (result == 1)
				return true;
		}
		return false;
	}

	public static long gcd(long a, long b) {
		if (a == 0)
			return b;
		if (b == 0)
			return a;
		if (a == b)
			return a;
		if (a > b)
			return gcd(a % b, b);
		return gcd(a, b % a);
	}
}
