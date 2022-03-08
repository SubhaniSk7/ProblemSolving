package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1359A_BerlandPoker {

	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
			solve(n, m, k);
		}
		System.out.println(sb.toString());
	}

	public static void solve(int n, int m, int k) {
		int d = n / k;
		int one = Math.min(m, d);
		int two = (m - one + k - 2) / (k - 1);
		sb.append((one - two) + "\n");
	}
}
