package codeforces.ITMO.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step2_NumberOfSegmentsWithSmallSum {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		long s = Long.parseLong(st.nextToken());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());

		solve(n, a, s);
	}

	public static void solve(int n, int[] a, long s) {
		int l = 0;
		long sum = 0, ans = 0;
		for (int r = 0; r < n; ++r) {
			sum += a[r];
			while (sum > s) {
				sum -= a[l];
				l++;
			}
			ans += r - l + 1;
		}
		System.out.println(ans);
	}
}
