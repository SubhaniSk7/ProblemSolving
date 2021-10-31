package leetproblems;

import java.util.HashMap;

public class Q1791_FindCenterOfStarGraph {
	public int findCenter(int[][] edges) {
		int m = edges.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < m; ++i) {
			int u = edges[i][0];
			int v = edges[i][1];
			map.put(u, map.getOrDefault(u, 0) + 1);
			map.put(v, map.getOrDefault(v, 0) + 1);
		}
		int n = map.keySet().size();
		for (int i = 1; i <= n; ++i)
			if (map.getOrDefault(i, 0) == n - 1)
				return i;
		return n;
	}
}
