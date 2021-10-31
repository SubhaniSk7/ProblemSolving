package leetproblems;

import java.util.PriorityQueue;

public class Q1584_MinCostToConnectAllPoints {
	int[] parent, size, distance;
	PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[2] - b[2]));
	int cost = 0;

	public int minCostConnectPoints(int[][] points) {
		int n = points.length;
		parent = new int[n];
		size = new int[n];

		for (int i = 0; i < n; ++i) {
			parent[i] = i;
			size[i] = 1;
		}

		for (int i = 0; i < n; ++i) {
			int[] p1 = points[i];
			for (int j = i + 1; j < n; ++j) {
				int[] p2 = points[j];
				int x = Math.abs(p1[0] - p2[0]), y = Math.abs(p1[1] - p2[1]);
				int d = x + y;
				pq.add(new int[] { i, j, d });
			}
		}
		mst_kruskal(n);
		return cost;
	}

	public void mst_kruskal(int n) {
		int count = 1;
		while (count < n) {// n-1 edges
			int[] edge = pq.poll();
			int u = edge[0], v = edge[1], w = edge[2];
			u = find(u);
			v = find(v);
			if (u != v) {
				union(u, v, w);
				count++;
			}
		}
	}

	public int find(int x) {
		while (parent[x] != x)
			x = parent[x];
		return x;
	}

	public void union(int u, int v, int w) {
		if (size[u] < size[v]) {
			int temp = u;
			u = v;
			v = temp;
		}
		size[u] += size[v];
		parent[v] = u;
		cost += w;
	}
}
