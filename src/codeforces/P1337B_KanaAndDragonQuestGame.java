package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1337B_KanaAndDragonQuestGame {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken()),
					m = Integer.parseInt(st.nextToken());
			sol(x, n, m);
		}
	}

	public static void sol(int x, int n, int m) {
		while (x > 0 && (n > 0 || m > 0)) {
			if (x - m * 10 <= 0) {
				x = 0;
				m = 0;
			} else {
				if (n > 0) {
					x = absorption(x);
					n--;
				} else if (m > 0) {
					x = strike(x);
					m--;
				}
			}
		}
		if (x > 0)
			System.out.println("NO");
		else
			System.out.println("YES");
	}

	public static int absorption(int x) {
		x = (x / 2) + 10;
		return x;
	}

	public static int strike(int x) {
		x -= 10;
		return x;
	}
}
