package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class P230B_TPrimes {
	public static boolean[] p = new boolean[1000001];

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		sieve(Long.parseLong("1000000"));
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i) {
			long num = Long.parseLong(st.nextToken());
			long root = (long) Math.sqrt(num);
			if (root * root == num && p[(int) root])
				System.out.println("YES");
			else
				System.out.println("NO");

		}
	}

	public static void sieve(long n) {
		Arrays.fill(p, true);
		p[0] = p[1] = false;
		for (int i = 2; i <= 1e6; ++i) {
			if (p[i]) {
				for (int j = 2 * i; j <= 1e6; j += i)
					p[j] = false;
			}
		}
	}
}