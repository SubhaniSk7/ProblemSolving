package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1327A_SumOfOddIntegers {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			long n = Long.parseLong(st.nextToken()), k = Long.parseLong(st.nextToken());
			sol(n, k);
		}
	}

	public static void sol(long n, long k) {
		if ((n + k) % 2 == 0 && (k * k <= n))
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
