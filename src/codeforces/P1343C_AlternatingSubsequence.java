package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1343C_AlternatingSubsequence {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] a = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			sol(n, a);
		}
	}

	public static void sol(int n, int[] a) {
		long sum = 0;
		for (int i = 0; i < n; ++i) {
			int present = a[i];
			int j = i + 1;
			while (j < n) {
				if ((present < 0 && a[j] < 0) || (present > 0 && a[j] > 0)) {
					present = Math.max(present, a[j]);
				} else
					break;
				j++;
			}
			sum += present;
			i = j - 1;
		}
		System.out.println(sum);
	}
}
