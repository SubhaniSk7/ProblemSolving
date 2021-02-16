package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1196A_ThreePilesOfCandies {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int t = Integer.parseInt(st.nextToken());
		while (t-- > 0) {
			st = new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken()), b = Long.parseLong(st.nextToken()),
					c = Long.parseLong(st.nextToken());
			sol(a, b, c);
		}
	}

	public static void sol(long a, long b, long c) {
		System.out.println((a + b + c) / 2);
	}
}
