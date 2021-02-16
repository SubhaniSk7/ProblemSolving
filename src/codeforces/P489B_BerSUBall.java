package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P489B_BerSUBall {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(br.readLine());
		int[] b = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; ++i)
			b[i] = Integer.parseInt(st.nextToken());
		solution(n, a, m, b);
	}

	public static void solution(int n, int[] a, int m, int[] b) {
		Arrays.sort(a);
		Arrays.sort(b);
		int i = 0, j = 0;
		int pairs = 0;
		while (i < n && j < m) {
			if (Math.abs(a[i] - b[j]) <= 1) {
				pairs++;
				i++;
				j++;
			} else if (a[i] > b[j]) {
				j++;
			} else
				i++;
		}
		System.out.println(pairs);
	}
}
