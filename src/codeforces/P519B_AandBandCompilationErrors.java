package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P519B_AandBandCompilationErrors {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n], b = new int[n], c = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n - 1; ++i)
			b[i] = Integer.parseInt(st.nextToken());
		b[n - 1] = Integer.MAX_VALUE;
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n - 2; ++i)
			c[i] = Integer.parseInt(st.nextToken());
		c[n - 1] = Integer.MAX_VALUE;
		c[n - 2] = Integer.MAX_VALUE;
		solution(n, a, b, c);
	}

	public static void solution(int n, int[] a, int[] b, int[] c) {
		Arrays.sort(a);
		Arrays.sort(b);
		Arrays.sort(c);
		int first = -1, second = -1;
		for (int i = 0, k = 0, l = 0; i < n; i++) {
			if (first == -1 && b[i] != a[i])
				first = a[i];
			if (second == -1 && c[i] != b[i])
				second = b[i];
		}
		System.out.println(first + "\n" + second);
	}
}
