package codeforces;

import java.io.*;
import java.util.*;

public class P1360B_HonestCoach {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] strengths = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				strengths[i] = Integer.parseInt(st.nextToken());
			solution(n, strengths);
		}

	}

	public static void solution(int n, int[] strengths) {
		Arrays.parallelSort(strengths);
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i < n - 1; ++i) {
			if (strengths[i + 1] - strengths[i] <= diff)
				diff = strengths[i + 1] - strengths[i];
		}
		System.out.println(diff);
	}
}
