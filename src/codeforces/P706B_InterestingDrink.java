package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P706B_InterestingDrink {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] x = new int[100001];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			x[Integer.parseInt(st.nextToken())] += 1;
		int q = Integer.parseInt(br.readLine());
		int[] m = new int[q];
		for (int i = 0; i < q; ++i)
			m[i] = Integer.parseInt(br.readLine());
		sol(n, x, q, m);
	}

	public static void sol(int n, int[] x, int q, int[] m) {
		int[] prefixSum = new int[100001];
		for (int i = 1; i < 100001; ++i)
			prefixSum[i] = prefixSum[i - 1] + x[i];
		for (int i = 0; i < q; ++i) {
			int count = 0;
			if (m[i] > 100000)
				count = n;
			else
				count = prefixSum[m[i]];
			System.out.println(count);
		}
	}
}
