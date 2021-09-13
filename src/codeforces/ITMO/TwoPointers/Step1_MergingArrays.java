package codeforces.ITMO.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Step1_MergingArrays {
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

		merge(n, a, m, b);
	}

	public static void merge(int n, int[] a, int m, int[] b) {

		int[] c = new int[n + m];
		int i = 0, j = 0, k = 0;
		while (i < n || j < m) {
			if (j == m || (i < n && a[i] < b[j])) {
				c[k++] = a[i++];
			} else {
				c[k++] = b[j++];
			}
		}
		for (i = 0; i < n + m; ++i)
			System.out.print(c[i] + " ");
		System.out.println();
	}
}
