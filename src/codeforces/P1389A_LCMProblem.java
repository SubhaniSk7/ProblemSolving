package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1389A_LCMProblem {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			sol(l, r);
		}
	}

	public static void sol(int l, int r) {
		int x = -1, y = -1;
		if (2 * l <= r) {
			x = l;
			y = 2 * l;
		}
		System.out.println(x + " " + y);
	}
}
