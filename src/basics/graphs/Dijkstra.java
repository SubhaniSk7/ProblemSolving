package basics.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Dijkstra {
	public static int[][] weights;
	public static ArrayList<Integer> vertices[];
	public static ArrayList<Integer> distance;
	public static Set<Integer> set = new TreeSet<Integer>();
	public static PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> Integer.compare(a[1], b[1]));
	public static ArrayList<Integer> parent = new ArrayList<>();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		weights = new int[n + 1][n + 1];
		vertices = new ArrayList[n + 1];
		distance = new ArrayList<Integer>();

		for (int i = 0; i <= n; ++i) {
			vertices[i] = new ArrayList<Integer>();
			if (i == 1) {// src = 1
				distance.add(0);
				parent.add(1);
			} else {
				distance.add(Integer.MAX_VALUE);
				parent.add(-1);
			}
		}
		for (int i = 0; i < m; ++i) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()),
					w = Integer.parseInt(st.nextToken());

			weights[u][v] = w;
			weights[v][u] = w;

			vertices[u].add(v);
			vertices[v].add(u);
		}
		shortestPath(n, m);
	}

	public static void shortestPath(int n, int m) {
		int src = 1;
		pq.offer(new int[] { src, distance.get(src) });
		while (set.size() != n) {
			if (pq.isEmpty())
				break;
			int[] node = pq.poll();
			int u = node[0];
			if (set.contains(u))
				continue;
			set.add(u);
			relaxEdge(u);
		}
//		System.out.println(distance.toString());
//		System.out.println(parent.toString());
		int x = n;
		if (parent.get(x) == -1)
			System.out.println(-1);
		else {
			ArrayList<Integer> path = new ArrayList<Integer>();
			while (parent.get(x) != x) {
				path.add(x);
				x = parent.get(x);
			}
			path.add(x);
			Collections.reverse(path);
//			System.out.println(path);
			for (int i = 0; i < path.size(); ++i)
				System.out.print(path.get(i) + " ");
			System.out.println();
		}
	}

	public static void relaxEdge(int u) {
		for (int neighbor : vertices[u]) {
			if (!set.contains(neighbor)) {
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
