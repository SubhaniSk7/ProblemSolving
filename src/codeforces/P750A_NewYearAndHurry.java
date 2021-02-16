package codeforces;

import java.io.*;
import java.util.*;

public class P750A_NewYearAndHurry {
	public static void main(String subhani[]) throws IOException, NumberFormatException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		solution(n, k);
	}

	public static void solution(int n, int k) {
		int problems = 0, left = 240 - k;
		for (int i = 1; i <= n; ++i) {
			if (left - 5 * i >= 0) {
				++problems;
				left -= 5 * i;
			} else
				break;
		}
		System.out.println(problems);
	}
}
