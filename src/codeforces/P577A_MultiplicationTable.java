package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P577A_MultiplicationTable {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), x = Integer.parseInt(st.nextToken());
		sol(n, x);
	}

	public static void sol(int n, int x) {
		int count = 0;
		for (int i = 1; i <= n; ++i) {
			if (x % i == 0 && x / i <= n)
				count++;
		}
		System.out.println(count);
	}
}
