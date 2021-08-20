package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class P115A_Party {
	public static int[] parent;
	public static int[] depth;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		parent = new int[n + 1];
		depth = new int[n + 1];

		for (int i = 1; i <= n; ++i) {
			int manager = Integer.parseInt(br.readLine());
			parent[i] = manager;
		}
		for (int i = 1; i <= n; ++i)
			depth[i] = getDepth(i);
		int groups = Integer.MIN_VALUE;
		for (int i = 1; i <= n; ++i)
			groups = Math.max(groups, depth[i]);
		System.out.println(groups);
	}

	public static int getDepth(int x) {
		int d = 1;
		while (parent[x] != -1) {
			x = parent[x];
			d++;
		}
		return d;
	}
}
