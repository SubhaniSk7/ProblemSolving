package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P169A_Chores {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), a = Integer.parseInt(st.nextToken()),
				b = Integer.parseInt(st.nextToken());
		int[] h = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			h[i] = Integer.parseInt(st.nextToken());
		sol(n, a, b, h);
	}

	public static void sol(int n, int a, int b, int[] h) {
		Arrays.parallelSort(h);
		int xMin = h[b - 1], xMax = h[b];
		int ways = 0;
		if (xMax != xMin)
			ways = xMax - xMin;
		System.out.println(ways);
	}
}
