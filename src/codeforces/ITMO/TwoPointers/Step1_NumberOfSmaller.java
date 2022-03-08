package codeforces.ITMO.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step1_NumberOfSmaller {
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
		solve_1(n, a, m, b);
	}

	public static void solve(int n, int[] a, int m, int[] b) {
		int[] count = new int[m];
		int i = 0, j = 0;
		while (i < n || j < m) {
			if (j == m || (i < n && a[i] < b[j])) {
				i++;
			} else {
				count[j] = i;
				j++;
			}
		}
		for (i = 0; i < m; ++i)
			System.out.print(count[i] + " ");
		System.out.println();
	}

	public static void solve_1(int n, int[] a, int m, int[] b) {
		int[] count = new int[m];
		for (int j = 0, i = 0; j < m; ++j) {
			while (i < n && a[i] < b[j])
				i++;
			count[j] = i;
		}
		for (int i = 0; i < m; ++i)
			System.out.print(count[i] + " ");
		System.out.println();
	}
}
