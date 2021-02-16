package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P702A_MaximumIncrease {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		sol(n, a);
	}

	public static void sol(int n, int[] a) {
		int max = 1, temp = 1;
		for (int i = 1; i < n; ++i) {
			if (a[i] > a[i - 1]) {
				temp++;
			} else {
				temp = 1;
			}
			max = Math.max(max, temp);
		}
		System.out.println(max);
	}
}
