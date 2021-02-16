package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P984A_Game {
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
		Arrays.parallelSort(a);
		int idx = n / 2;
		if (n % 2 == 0)
			idx = (n - 1) / 2;
		System.out.println(a[idx]);
	}
}
