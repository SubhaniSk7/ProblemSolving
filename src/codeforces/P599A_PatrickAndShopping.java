package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P599A_PatrickAndShopping {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int d1 = Integer.parseInt(st.nextToken()), d2 = Integer.parseInt(st.nextToken()),
				d3 = Integer.parseInt(st.nextToken());
		sol(d1, d2, d3);
	}

	public static void sol(int d1, int d2, int d3) {
		int distance = Math.min(2 * d1 + 2 * d2, Math.min(d1 + d3 + d2, Math.min(2 * d1 + 2 * d3, 2 * d2 + 2 * d3)));
		System.out.println(distance);
	}
}
