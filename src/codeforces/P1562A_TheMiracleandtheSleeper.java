package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1562A_TheMiracleandtheSleeper {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int l = Integer.parseInt(st.nextToken()), r = Integer.parseInt(st.nextToken());
			solve(l, r);
		}
	}

	public static void solve(int l, int r) {
		if (l <= (r / 2))
			System.out.println(r % ((r / 2) + 1));
		else
			System.out.println(r % l);
	}
}
