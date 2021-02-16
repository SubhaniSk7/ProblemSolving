package codeforces;

import java.io.*;
import java.util.*;

public class P1092B_TeamsForming {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] skills = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			skills[i] = Integer.parseInt(st.nextToken());
		solution(n, skills);
	}

	public static void solution(int n, int[] skills) {
		Arrays.parallelSort(skills);
		int problems = 0;
		for (int i = 0; i < n; i += 2)
			problems += (skills[i + 1] - skills[i]);
		System.out.println(problems);
	}
}
