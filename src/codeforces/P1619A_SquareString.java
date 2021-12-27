package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1619A_SquareString {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			String s = br.readLine();
			solve(s);
		}
	}

	public static void solve(String s) {
		if (s.length() % 2 != 0) {
			System.out.println("NO");
		} else {
			int n = s.length();
			if (s.substring(0, n / 2).equals(s.substring(n / 2)))
				System.out.println("YES");
			else
				System.out.println("NO");
		}
	}
}
