package basics.unionfind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class UnionFind {
	public static int[] parent, size;// parent = parent of element in a set, size = size of set

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());// #elements
		parent = new int[n];
		size = new int[n];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();// nodes are from 0->n-1
		for (int i = 0; i < n; ++i) {
			pq.add(i);
			parent[i] = i;// or -1
			size[i] = 1;
		}

		int a = pq.poll();
		while (!pq.isEmpty()) {
			int b = pq.poll();
			if (find(a) != find(b))
				union(a, b);
		}
		print();
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (size[a] < size[b]) {// always smallest in 'b', largest in 'a'-->connecting small tree 'b' to large tree 'a'
			int temp = a;
			a = b;
			b = temp;
		}
		size[a] += size[b];
		parent[b] = a;
	}

	public static int find(int x) {// returns parent of x in a set
		while (x != parent[x])
			x = parent[x];
		return x;
	}

	public static void print() {
		for (int i = 0; i < parent.length; ++i)
			System.out.println(i + " " + parent[i]);
	}
}
