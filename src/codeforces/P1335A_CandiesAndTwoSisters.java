package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1335A_CandiesAndTwoSisters {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solution(n);
		}
	}

	public static void solution(int n) {
		int ways = 0;
		if (n % 2 == 0)
			ways = n / 2 - 1;
		else
			ways = n / 2;
		System.out.println(ways);// or ways=(n-1)/2
	}
}
