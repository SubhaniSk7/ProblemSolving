package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P34B_Sale {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] costs = new int[n];
		for (int i = 0; i < n; ++i)
			costs[i] = Integer.parseInt(st.nextToken());
		solve(n, m, costs);
	}

	public static void solve(int n, int m, int[] costs) {
		Arrays.sort(costs);
		long result = 0;
		for (int i = 0; i < m; ++i) {
			if (costs[i] > 0) {
				break;
			}
			result += -1 * costs[i];
		}
		System.out.println(result);
	}
}
