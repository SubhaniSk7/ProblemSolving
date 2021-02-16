package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1030A_InOfAnEasyProblem {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] opinions = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			opinions[i] = Integer.parseInt(st.nextToken());
		solution(n, opinions);
	}

	public static void solution(int n, int[] opinions) {
		boolean hard = false;
		for (int i = 0; i < n; ++i)
			if (opinions[i] != 0) {
				hard = true;
				break;
			}
		if (hard)
			System.out.println("HARD");
		else
			System.out.println("EASY");
	}
}
