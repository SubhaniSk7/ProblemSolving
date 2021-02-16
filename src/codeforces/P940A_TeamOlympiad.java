package codeforces;

import java.io.*;
import java.util.*;

public class P940A_TeamOlympiad {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] values = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			values[i] = Integer.parseInt(st.nextToken());
		solution(n, values);
	}

	public static void solution(int n, int[] values) {
		int ones = 0, twos = 0, threes = 0;
		ArrayList<Integer> onesIndices = new ArrayList<>(), twosIndices = new ArrayList<>(),
				threesIndices = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			if (values[i] == 1) {
				ones++;
				onesIndices.add(i + 1);
			} else if (values[i] == 2) {
				twos++;
				twosIndices.add(i + 1);
			} else {
				threes++;
				threesIndices.add(i + 1);
			}
		}
		if (ones != 0 && twos != 0 && threes != 0) {
			int min = Math.min(ones, Math.min(twos, threes));
			System.out.println(min);
			for (int i = 0; i < min; i++)
				System.out.println(onesIndices.get(i) + " " + twosIndices.get(i) + " " + threesIndices.get(i));
		} else
			System.out.println(0);
	}
}
