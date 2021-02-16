package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P327A_FlippingGame {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		solution(n, a);
	}

	public static void solution(int n, int[] a) {
		int max = 0;
		for (int i = 0; i < n; ++i) {
			for (int j = i; j < n; ++j) {
				int sum = 0;
				for (int k = 0; k < n; ++k) {
					if (i <= k && k <= j)
						sum += (1 - a[k]);
					else
						sum += a[k];
				}
				max = Math.max(max, sum);
			}
		}
		System.out.println(max);
	}
}
