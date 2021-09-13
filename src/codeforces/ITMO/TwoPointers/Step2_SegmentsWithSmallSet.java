package codeforces.ITMO.TwoPointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Step2_SegmentsWithSmallSet {
	public static int count = 0, k;
	public static long res = 0;
	public static HashMap<Integer, Integer> map = new HashMap<>();
	public static int[] a;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		a = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());

		solve(n, a, k);
	}

	public static void solve(int n, int[] a, int k) {
		int l = 0;
		for (int r = 0; r < n; ++r) {
			add(r);
			while (!good()) {
				remove(l);
				l++;
			}
			res += r - l + 1;
		}
		System.out.println(res);
	}

	public static void add(int r) {
		map.put(a[r], map.getOrDefault(a[r], 0) + 1);
		if (map.get(a[r]) == 1)
			count++;
	}

	public static void remove(int l) {
		map.put(a[l], map.get(a[l]) - 1);
		if (map.get(a[l]) == 0)
			count--;
	}

	public static boolean good() {
		return count <= k;
	}
}
