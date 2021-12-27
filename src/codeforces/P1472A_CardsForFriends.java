package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1472A_CardsForFriends {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken()), h = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
			solve(w, h, n);
		}
	}

	public static void solve(int w, int h, int n) {
		int papers = 1;
		while (h % 2 == 0) {
			papers *= 2;
			h /= 2;
		}
		while (w % 2 == 0) {
			papers *= 2;
			w /= 2;
		}

		if (papers >= n)
			System.out.println("YES");
		else
			System.out.println("NO");
	}
}
