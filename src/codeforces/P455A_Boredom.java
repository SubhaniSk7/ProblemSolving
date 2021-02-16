package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P455A_Boredom {
	public static long[] dp = new long[(int) (1e5 + 1)];

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		solution(n, a);
	}

	public static void solution(int n, int[] a) {
		HashMap<Integer, Long> freq = new HashMap<>();
		for (int i = 0; i < n; ++i)
			freq.put(a[i], freq.getOrDefault(a[i], (long) 0) + 1);
		dp[0] = 0;
		dp[1] = freq.getOrDefault(1, (long) 0);
		for (int i = 2; i < (int) 1e5 + 1; ++i)
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + i * freq.getOrDefault(i, (long) 0));
		System.out.println(dp[100000]);
	}
}
