package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P1206A_ChooseTwoNumbers {
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

		solution(n, m, a, b);
	}

	public static void solution(int n, int m, int[] a, int[] b) {
		int maxA = Integer.MIN_VALUE, maxB = Integer.MIN_VALUE;
		for (int i = 0; i < n; ++i)
			maxA = Math.max(maxA, a[i]);
		for (int i = 0; i < m; ++i)
			maxB = Math.max(maxB, b[i]);
		System.out.println(maxA + " " + maxB);
	}
}
