package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P1520A_DoNotBeDistracted {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			int n = Integer.parseInt(br.readLine());
			String s = br.readLine();
			System.out.println(solve(n, s));
		}
	}

	public static String solve(int n, String s) {
		HashMap<Character, Boolean> map = new HashMap<>();
		map.put(s.charAt(0), true);
		for (int i = 1; i < n; ++i) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				continue;
			} else {
				if (map.getOrDefault(s.charAt(i), false)) {
					return "NO";
				} else
					map.put(s.charAt(i), true);
			}
		}
		return "YES";
	}
}
