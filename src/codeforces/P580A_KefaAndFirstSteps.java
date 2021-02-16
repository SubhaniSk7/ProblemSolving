package codeforces;

import java.io.*;
import java.util.StringTokenizer;

public class P580A_KefaAndFirstSteps {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] money = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			money[i] = Integer.parseInt(st.nextToken());
		sol(n, money);
	}

	public static void sol(int n, int[] money) {
		int max = 0, temp = 1;
		for (int i = 0; i < n - 1; i++) {
			if (money[i] <= money[i + 1])
				temp++;
			else {
				max = Math.max(max, temp);
				temp = 1;
			}
		}
		max = Math.max(max, temp);
		System.out.println(max);
	}
}
