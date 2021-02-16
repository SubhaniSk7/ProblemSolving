package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1206B_MakeProductEqualOne {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		sol(n, a);
	}

	public static void sol(int n, int[] a) {
		int zeroCount = 0, product = 1;
		long cost = 0;
		for (int i = 0; i < n; ++i) {
			if (a[i] < 0) {
				cost += -a[i] - 1;
				a[i] = a[i] - a[i] - 1;
				product *= -1;
			} else if (a[i] == 0) {
				cost += 1;
				zeroCount++;
			} else {
				cost += a[i] - 1;
				a[i] = a[i] - a[i] + 1;
			}
		}
		if (product == -1 && zeroCount == 0)
			cost += 2;
		System.out.println(cost);
	}
}
