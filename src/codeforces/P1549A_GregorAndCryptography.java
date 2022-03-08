package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1549A_GregorAndCryptography {
	public static StringBuilder sb = new StringBuilder();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long p = Long.parseLong(st.nextToken());
			solve(p);
		}
		System.out.println(sb.toString());
	}

	public static void solve(long p) {
		sb.append("2 " + (p - 1) + "\n");
	}
}
