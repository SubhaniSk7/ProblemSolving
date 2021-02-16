package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1234A_EqualizePricesAgain {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int q = Integer.parseInt(br.readLine());
		while (q-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] prices = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				prices[i] = Integer.parseInt(st.nextToken());
			solution(n, prices);
		}
	}

	public static void solution(int n, int[] prices) {
		int sum = 0, ans = 0;
		for (int i = 0; i < n; ++i)
			sum += prices[i];
		ans = (sum + (n - 1)) / n;
		System.out.println(ans);
	}
}
