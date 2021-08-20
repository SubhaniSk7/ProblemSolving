package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class P1560D_MakeAPowerOfTwo {
	public static ArrayList<String> powers = new ArrayList<>();
	public static long max = (long) 1e18;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		fillPowers();
		while (t-- > 0) {
			String n = br.readLine();
			int ans = n.length() + 1;
			for (String x : powers)
				ans = Math.min(ans, solve(n, x));
			System.out.println(ans);
		}
	}

	public static int solve(String n, String x) {
		int i = 0, j = 0, taken = 0;
		while (i < n.length() && j < x.length()) {
			if (n.charAt(i) == x.charAt(j)) {
				taken++;
				j++;
			}
			i++;
		}
		return n.length() - taken + x.length() - taken;
	}

	public static void fillPowers() {
		for (long i = 1; i <= max; i *= 2)
			powers.add("" + i);
	}
}
