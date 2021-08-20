package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class P1559B_MochaAndRedandBlue {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			String s = br.readLine();
			solve(s, n);

		}
	}

	public static void solve(String s, int n) {

		while (true) {
			if (n - s.replaceAll("\\?", "").length() == n) {
				if (n == 1)
					s = "R";
				else
					s = "R" + s.substring(1, n);
			}
			s = s.replaceAll("\\?R", "BR");
			s = s.replaceAll("\\?B", "RB");
			s = s.replaceAll("R\\?", "RB");
			s = s.replaceAll("B\\?", "BR");
			if (done(s)) {
				System.out.println(s);
				break;
			}
		}
	}

	public static boolean done(String s) {
		if (s.length() - s.replaceAll("\\?", "").length() == 0)
			return true;
		else
			return false;
	}
}
