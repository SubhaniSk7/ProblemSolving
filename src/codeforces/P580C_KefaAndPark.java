package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class P580C_KefaAndPark {
	public static ArrayList<ArrayList<Integer>> edges = new ArrayList<>();
	public static int[] cats;
	public static int n, m;
	public static long result = 0;
	public static boolean[] visited;

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		for (int i = 0; i <= n; ++i)
			edges.add(new ArrayList<Integer>());
		cats = new int[n + 1];
		st = new StringTokenizer(br.readLine());
		visited = new boolean[n + 1];
		for (int i = 1; i <= n; ++i) {
			cats[i] = Integer.parseInt(st.nextToken());
			visited[i] = false;
		}
		for (int i = 1; i <= n - 1; ++i) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken()), y = Integer.parseInt(st.nextToken());
			edges.get(x).add(y);
			edges.get(y).add(x);
		}
		solve();
	}

	public static void solve() {
		dfs(1, -1, 0);
		System.out.println(result);
	}

	public static void dfs(int u, int parent, int count) {
		if (cats[u] == 1)
			count++;
		else
			count = 0;
		if (count > m)
			return;
		if (u != 1 && edges.get(u).size() == 1) {
			result++;
			return;
		}

		for (int v : edges.get(u)) {
			if (v != parent)
				dfs(v, u, count);
		}
	}
}
