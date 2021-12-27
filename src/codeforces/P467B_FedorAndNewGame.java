package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P467B_FedorAndNewGame {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		int[] armies = new int[m + 1];
		for (int i = 0; i <= m; ++i)
			armies[i] = Integer.parseInt(br.readLine());
		solve(n, m, k, armies);
	}

	public static void solve(int n, int m, int k, int[] armies) {
		int fedor = armies[m];
		int friends = 0;
		for (int i = 0; i < m; ++i) {
			int player = armies[i];
			int count = 0;
			for (int b = 0; b < n; ++b) {
				if ((player & (1 << b)) != (fedor & (1 << b)))
					count++;
				if (count > k)
					break;
			}
			if (count <= k)
				friends++;
		}
		System.out.println(friends);
	}
}
