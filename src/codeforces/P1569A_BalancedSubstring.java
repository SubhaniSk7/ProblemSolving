package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P1569A_BalancedSubstring {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			solve(n, s);
		}
	}

	public static void solve(int n, String s) {
		if (!s.contains("a") || !s.contains("b"))
			System.out.println(-1 + " " + -1);
		else {
			int index = 0;
			if (s.contains("ab"))
				index = s.indexOf("ab") + 1;
			else
				index = s.indexOf("ba") + 1;
			System.out.println(index + " " + (index + 1));
		}
	}
}
