package codeforces;

import java.io.*;
import java.util.*;

public class P991B_GettingAnA {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] works = new int[n];
		for (int i = 0; i < n; ++i)
			works[i] = Integer.parseInt(st.nextToken());
		solution(n, works);
	}

	public static void solution(int n, int[] works) {
		Arrays.parallelSort(works);
		int count = 0;
		double sum = 0;
		for (int i = 0; i < n; ++i) {
			sum += works[i];
		}
		if (sum / n < 4.5) {
			for (int i = 0; i < n; i++) {
				if (works[i] == 5)
					break;
				else {
					int diff = 5 - works[i];
					works[i] = works[i] + diff;
					sum += diff;
					count++;
				}
				if (sum / n >= 4.5)
					break;
			}
		}
		System.out.println(count);
	}
}
