package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P478B_RandomTeams {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		long n = Long.parseLong(st.nextToken()), m = Long.parseLong(st.nextToken());
		solve(n, m);
	}

	public static void solve(long n, long m) {
		long max = (n - m + 1) * (n - m) / 2;// 1 to m-1 teams and remaining(n-m+1) to one team

		long min = 0;
		long x = n / m;

		if (n % m == 0) {
			min = m * x * (x - 1) / 2;
		} else {
			min = m * x * (x - 1) / 2;
			min += ((n % m) * x);
		}
		System.out.println(min + " " + max);
	}
}
