package codeforces;

import java.io.*;
import java.util.*;

public class P337A_Puzzles {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		int[] puzzles = new int[m];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; ++i)
			puzzles[i] = Integer.parseInt(st.nextToken());
		solution(n, m, puzzles);
	}

	public static void solution(int n, int m, int[] puzzles) {
		Arrays.parallelSort(puzzles);
		int diff = Integer.MAX_VALUE;
		for (int i = 0; i <= m - n; i++)
			diff = Math.min(diff, puzzles[i + n - 1] - puzzles[i]);
		System.out.println(diff);
	}
}
