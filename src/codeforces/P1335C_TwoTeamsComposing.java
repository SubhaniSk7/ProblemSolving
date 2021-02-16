package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class P1335C_TwoTeamsComposing {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int[] a = new int[n];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; ++i)
				a[i] = Integer.parseInt(st.nextToken());
			sol(n, a);
		}
	}

	public static void sol(int n, int[] a) {
		HashMap<Integer, Integer> map = new HashMap<>();
		int maxFreq = 0;
		for (int i = 0; i < n; ++i) {
			map.put(a[i], map.getOrDefault(a[i], 0) + 1);
			maxFreq = Math.max(maxFreq, map.get(a[i]));
		}
		int diff = map.keySet().size();
		System.out.println(Math.max(Math.min(diff - 1, maxFreq), Math.min(diff, maxFreq - 1)));
	}
}
