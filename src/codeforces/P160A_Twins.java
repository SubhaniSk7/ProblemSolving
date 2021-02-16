package codeforces;

import java.io.*;
import java.util.*;

public class P160A_Twins {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] money = new int[n];
		for (int i = 0; i < n; ++i)
			money[i] = Integer.parseInt(st.nextToken());
		solution(n, money);
	}

	public static void solution(int n, int[] money) {
		int aSum = 0, coins = 0, total = 0;
		Arrays.parallelSort(money);
		for (int i = 0; i < n; ++i)
			total += money[i];
		for (int i = n - 1; i >= 0; --i) {
			aSum += money[i];
			total -= money[i];
			coins++;
			if (aSum > total)
				break;
		}
		System.out.println(coins);
	}
}
