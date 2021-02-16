package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1113A_SashaAndHisTrip {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken());
		sol(n, v);
	}

	public static void sol(int n, int v) {
		int cost = 0;
		if (v > n - 1) {
			cost = n - 1;
			v = n - 1;
		} else
			cost = v;
		for (int i = 2; i < n; ++i) {
			if (v == n - 1)
				break;
			cost += i;
			v++;
		}
		System.out.println(cost);
	}
}
