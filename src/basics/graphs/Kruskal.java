package basics.graphs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Kruskal {
	static BufferedReader br;
	static PrintStream out;

	static int n, e;
	static ArrayList<int[]> edges = new ArrayList<>();
	static ArrayList<Integer> parent = new ArrayList<>(), size = new ArrayList<>();
	static PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> (a[2] - b[2]));
	static int cost = 0;

	public static void read() throws IOException {
		br = new BufferedReader(new FileReader("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\input.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\output.txt", append), autoFlush);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());

		for (int i = 0; i <= n; ++i) {
			parent.add(i);
			size.add(1);
		}

		for (int i = 0; i < e; ++i) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());

			int[] ed = new int[] { u, v, w };
			pq.add(ed);
		}
	}

	public static void main(String[] subhani) throws IOException {
		read();// graph should be connected
		mst_kruskal();
		print();
	}

	public static void mst_kruskal() {
		int count = 1;
		while (count < n) {// edges will be n-1
			int[] ed = pq.poll();
			int u = ed[0], v = ed[1], w = ed[2];
			if (find(u) != find(v)) {
				union(u, v, w);
				count++;
			}
		}
	}

	public static void union(int u, int v, int w) {
		u = find(u);
		v = find(v);
		if (size.get(u) < size.get(v)) {
			int temp = u;
			u = v;
			v = temp;
		}
		parent.set(v, parent.get(u));
		size.set(u, size.get(u) + size.get(v));

		cost += w;
		edges.add(new int[] { u, v, w });
	}

	public static int find(int x) {
		while (parent.get(x) != x)
			x = parent.get(x);
		return x;
	}

	public static void print() {
		out.println("cost:" + cost);
		for (int[] ed : edges)
			out.println(Arrays.toString(ed));
	}
}
