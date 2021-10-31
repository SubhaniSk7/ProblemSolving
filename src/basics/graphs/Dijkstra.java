package basics.graphs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Dijkstra {
	public static PrintStream out;
	public static BufferedReader br;
	public static GraphUtils utils = new GraphUtils();

	public static int n, e;
	public static int[][] weights;
	public static ArrayList<Set<Integer>> vertices = new ArrayList<>();
	public static ArrayList<Integer> distance = new ArrayList<>();
	public static Set<Integer> explored = new TreeSet<Integer>();
	public static PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
	public static ArrayList<Integer> parent = new ArrayList<>();

	public static void read() throws IOException {
		br = new BufferedReader(new FileReader("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\input.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(
				new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\output.txt", append),
				autoFlush);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());// 1 to n
		e = Integer.parseInt(st.nextToken());
		weights = new int[n + 1][n + 1];

		for (int i = 0; i <= n; ++i) {
			Set<Integer> edges = new HashSet<Integer>();
			vertices.add(edges);
			if (i == 1) {// src = 1
				distance.add(0);
				parent.add(1);
			} else {
				distance.add(Integer.MAX_VALUE);
				parent.add(-1);
			}
		}
		for (int i = 0; i < e; ++i) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()),
					w = Integer.parseInt(st.nextToken());
			weights[u][v] = w;
			weights[v][u] = w;
			vertices.get(u).add(v);
			vertices.get(v).add(u);
		}
	}

	public static void main(String[] subhani) throws IOException {
		read();
		shortestPath(n);

		int x = n;
		if (parent.get(x) == -1)
			out.println(-1);
		else {
			ArrayList<Integer> path = new ArrayList<Integer>();
			while (parent.get(x) != x) {
				path.add(x);
				x = parent.get(x);
			}
			path.add(x);
			Collections.reverse(path);
			for (int i = 0; i < path.size(); ++i)
				out.print(path.get(i) + " ");
			out.println();
		}
	}

	public static void shortestPath(int n) {
		int src = 1;
		pq.offer(new int[] { src, distance.get(src) });
		while (explored.size() != n) {
			if (pq.isEmpty())
				break;
			int[] node = pq.poll();
			int u = node[0];
			if (explored.contains(u))
				continue;
			explored.add(u);
			relaxEdge(u);
		}
	}

	public static void relaxEdge(int u) {
		for (int neighbor : vertices.get(u)) {
			if (!explored.contains(neighbor)) {
				int newDistance = distance.get(u) + weights[u][neighbor];
				if (distance.get(neighbor) > newDistance) {
					distance.set(neighbor, newDistance);
					parent.set(neighbor, u);
				}
				pq.offer(new int[] { neighbor, distance.get(neighbor) });
			}
		}
	}
}
