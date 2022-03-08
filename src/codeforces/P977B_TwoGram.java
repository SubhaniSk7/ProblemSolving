package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class P977B_TwoGram {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String s = br.readLine();
		solve(n, s);
	}

	public static void solve(int n, String s) {
		HashMap<String, Integer> map = new HashMap<>();
		int max = 0;
		String result = "";
		for (int i = 0; i < n - 1; ++i) {
			String t = s.substring(i, i + 2);
			map.put(t, map.getOrDefault(t, 0) + 1);
			if (map.get(t) > max) {
				result = t;
				max = map.get(t);
			}
		}
		System.out.println(result);
	}
}
