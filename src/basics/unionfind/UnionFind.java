package basics.unionfind;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class UnionFind {
	public static int[] link, size;// link = parent of element in a set, size = size of set

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());// #elements
		int[] arr = new int[n];
		link = new int[n];
		size = new int[n];
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();// nodes are from 0->n
		for (int i = 0; i < n; ++i) {
			pq.add(i);
			link[i] = i;
			size[i] = 1;
		}

		int a = pq.poll();
		while (!pq.isEmpty()) {
			int b = pq.poll();
			if (!same(a, b))
				union(a, b);
		}
		print();
	}

	public static void union(int a, int b) {
		a = find(a);
		b = find(b);
		if (size[a] < size[b]) {// smallest will become 'a', largest in 'b'
			int temp = a;
			a = b;
			b = temp;
		}
		size[a] += size[b];
		link[b] = a;
	}

	public static int find(int x) {// returns parent of x in a set
		while (x != link[x])
			x = link[x];
		return x;
	}

	public static boolean same(int a, int b) {
		return find(a) == find(b);
	}

	public static void print() {
		for (int i = 0; i < link.length; ++i)
			System.out.println(i + " " + link[i]);
	}
}
