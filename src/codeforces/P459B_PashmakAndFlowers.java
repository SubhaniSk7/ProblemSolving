package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P459B_PashmakAndFlowers {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		long[] flowers = new long[n];
		for (int i = 0; i < n; ++i)
			flowers[i] = Long.parseLong(st.nextToken());
		solve(n, flowers);
	}

	public static void solve(int n, long[] flowers) {

		Arrays.sort(flowers);
		long min = flowers[0], max = flowers[n - 1];
		long minCount = 0, maxCount = 0;
		int i = 0;
		while (i < n && flowers[i] == min) {
			minCount++;
			i++;
		}
		i = n - 1;
		while (i >= 0 && flowers[i] == max) {
			maxCount++;
			i--;
		}
		long diff = max - min;
		long combinations = 0;
		if (min == max) {
			combinations = minCount * (minCount - 1) / 2;
		} else {
			combinations = minCount * maxCount;
		}
		System.out.println(diff + " " + combinations);
	}
}
