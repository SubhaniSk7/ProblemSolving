package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P1398A_BadTriangle {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			long[] a = new long[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Long.parseLong(st.nextToken());
			sol(n, a);
		}
	}

	public static void sol(int n, long[] a) {
		Arrays.parallelSort(a);
		boolean impossible = false;
		for (int i = 0; i < n - 2; ++i) {
			if (a[i] + a[i + 1] <= a[n - i - 1]) {
				System.out.println((i + 1) + " " + (i + 2) + " " + (n - i));
				impossible = true;
				return;
			}
		}
		if (!impossible)
			System.out.println(-1);
	}
}
