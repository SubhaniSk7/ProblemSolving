package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class P368B_SerejaAndSuffixes {
	public static int[] a, distinctCount;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		a = new int[n];
		distinctCount = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		fillDistinct(n);
		for (int i = 0; i < m; ++i) {
			int l = Integer.parseInt(br.readLine());
			System.out.println(distinctCount[l - 1]);
		}
	}

	public static void fillDistinct(int n) {
		Set<Integer> set = new HashSet<>();
		for (int i = n - 1; i >= 0; --i) {
			set.add(a[i]);
			distinctCount[i] = set.size();
		}
	}
}
