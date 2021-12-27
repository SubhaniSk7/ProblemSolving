package leetproblems;

public class Q547_NumberOfProvinces {
	int[] parent;
	int[] size;

	public int findCircleNum(int[][] isConnected) {
		int n = isConnected.length;
		parent = new int[n];
		size = new int[n];
		for (int i = 0; i < n; ++i) {
			parent[i] = i;
			size[i] = 1;
		}

		int provinces = n;
		for (int i = 0; i < n - 1; ++i) {
			for (int j = i + 1; j < n; ++j) {
				if (isConnected[i][j] == 1 && find(i) != find(j)) {
					union(i, j);
					provinces--;
				}
			}
		}
		return provinces;
	}

	public int find(int x) {
		while (x != parent[x])
			x = parent[x];
		return x;
	}

	public void union(int u, int v) {
		int a = find(u);
		int b = find(v);
		if (size[a] < size[b]) {
			int temp = a;
			a = b;
			b = temp;
		}
		size[a] += size[b];
		parent[b] = a;
	}
}
