package leetproblems;

public class Q684_RedundantConnection {
	int[] parent, size;

	public int[] findRedundantConnection(int[][] edges) {
		int n = edges.length;
		parent = new int[n + 1];
		size = new int[n + 1];

		for (int i = 0; i <= n; ++i) {
			parent[i] = i;
			size[i] = 1;
		}
		int[] result = new int[2];
		for (int[] edge : edges) {
			int u = edge[0];
			int v = edge[1];
			if (find(u) != find(v))
				union(u, v);
			else
				result = edge;
		}
		return result;
	}

	public void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (size[a] < size[b]) {
			int temp = a;
			a = b;
			b = temp;
		}
		size[a] += size[b];
		parent[b] = a;
	}

	public int find(int x) {
		while (parent[x] != x)
			x = parent[x];
		return x;
	}
}
