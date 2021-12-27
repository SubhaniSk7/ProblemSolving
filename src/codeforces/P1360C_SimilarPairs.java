package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1360C_SimilarPairs {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[] arr = new int[n];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				arr[i] = Integer.parseInt(st.nextToken());
			solve(n, arr);
		}
	}

	public static void solve(int n, int[] arr) {
		int evens = 0, odds = 0;
		for (int i = 0; i < n; ++i) {
			if (arr[i] % 2 == 0)
				evens++;
			else
				odds++;
		}
		if (evens % 2 != odds % 2) {
			System.out.println("NO");
		} else {
			if (evens % 2 == 0)
				System.out.println("YES");
			else {
				for (int i = 0; i < n; ++i) {
					for (int j = i + 1; j < n; ++j) {
						if (arr[i] % 2 != arr[j] && Math.abs(arr[i] - arr[j]) == 1) {
							System.out.println("YES");
							return;
						}
					}
				}
				System.out.println("NO");
			}
		}
	}
}
