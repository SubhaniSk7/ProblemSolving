package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1454B_UniqueBidAuction {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			int[][] a = new int[n + 1][2];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i) {
				int e = Integer.parseInt(st.nextToken());
				a[e][0]++;
				a[e][1] = i + 1;
			}
			int ans = -1;
			for (int i = 1; i <= n; ++i) {
				if (a[i][0] == 1) {
					ans = a[i][1];
					break;
				}
			}
			sb.append(ans + "\n");
		}
		System.out.println(sb.toString());
	}
}
