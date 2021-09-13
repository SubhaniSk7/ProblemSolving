package codeforces.ITMO.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step1_NumberOfEqual {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());// #elements
		int[] a = new int[n], b = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; ++i)
			b[i] = Integer.parseInt(st.nextToken());

		solve(n, a, m, b);
	}

	public static void solve(int n, int[] a, int m, int[] b) {
		int i = 0, res = 0;
		long sum = 0;
		for (int j = 0; j < m; ++j) {
			if (j - 1 >= 0 && b[j] == b[j - 1]) {
				sum += res;
			} else {
				res = 0;
				while (i < n && a[i] <= b[j]) {
					if (a[i] == b[j])
						res++;
					i++;
				}
				sum += res;
			}
		}
		System.out.println(sum);
	}
}
