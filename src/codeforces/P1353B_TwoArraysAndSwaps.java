package codeforces;

import java.io.*;
import java.util.*;

public class P1353B_TwoArraysAndSwaps {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			int[] a = new int[n], b = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				b[i] = Integer.parseInt(st.nextToken());
			solution(n, k, a, b);
		}
	}

	public static void solution(int n, int k, int[] a, int[] b) {
		Arrays.parallelSort(a);
		Arrays.parallelSort(b);
		int aI = 0, bI = n - 1;
		for (int i = 0; i < k; ++i) {
			if (a[aI] <= b[bI]) {
				int temp = a[aI];
				a[aI++] = b[bI];
				b[bI--] = temp;
			}
		}
		int sum = 0;
		for (int i = 0; i < n; ++i)
			sum += a[i];
		System.out.println(sum);
	}
}
