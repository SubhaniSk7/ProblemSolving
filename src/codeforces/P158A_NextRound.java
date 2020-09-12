package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P158A_NextRound {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		int[] scores = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			scores[i] = Integer.parseInt(st.nextToken());
		solution(scores, n, k);
	}

	public static void solution(int[] scores, int n, int k) {
		int kthScore = scores[k - 1], count = 0;
		for (int i = 0; i < n; ++i)
			if (scores[i] > 0 && scores[i] >= kthScore)
				count++;
		System.out.println(count);
	}
}
