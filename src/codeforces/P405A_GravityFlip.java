package codeforces;

import java.io.*;
import java.util.*;

public class P405A_GravityFlip {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] cubes = new int[n];
		for (int i = 0; i < n; ++i)
			cubes[i] = Integer.parseInt(st.nextToken());
		solution(n, cubes);
	}

	public static void solution(int n, int[] cubes) {
		Arrays.parallelSort(cubes);
		for (int i = 0; i < n; ++i)
			System.out.print(cubes[i] + " ");
	}

}
