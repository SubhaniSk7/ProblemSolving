package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1541A_PrettyPermutations {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			solve(n);
		}
		System.out.println(sb.toString());
	}

	public static void solve(int n) {

		int[] result = new int[n];
		for (int i = 0; i < n - 1; i += 2) {
			result[i] = i + 2;
			result[i + 1] = i + 1;
		}
		if (n % 2 == 1) {
			int temp = result[n - 2];
			result[n - 2] = n;
			result[n - 1] = temp;
		}
		for (int i = 0; i < n; ++i)
			sb.append(result[i] + " ");
		sb.append("\n");
	}
}
