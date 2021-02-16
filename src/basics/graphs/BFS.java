package basics.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class BFS {
	public static int n, e;
	public static ArrayList<Set<Integer>> vertices;

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		vertices = new ArrayList<Set<Integer>>(n);
		for (int i = 0; i < n; ++i) {
			Set<Integer> edges = new HashSet<Integer>();
			vertices.add(edges);
		}
		for (int i = 0; i < e; ++i) {
			st = new StringTokenizer(br.readLine());
			int source = Integer.parseInt(st.nextToken()), destination = Integer.parseInt(st.nextToken());
			vertices.get(source).add(destination);
			vertices.get(destination).add(source);
		}
		printGraph();
		bfs(2);
	}

	public static void printGraph() {
		Iterator<Set<Integer>> graph = vertices.iterator();
		while (graph.hasNext()) {
			System.out.println(graph.next().toString());
		}
	}

	public static void bfs(int source) {
		boolean[] visited = new boolean[n];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		visited[source] = true;
		while (!queue.isEmpty()) {
			source = queue.poll();
			System.out.println(source);
			Iterator<Integer> itr = vertices.get(source).iterator();
			while (itr.hasNext()) {
				int neighbour = itr.next();
				if (!visited[neighbour]) {
					visited[neighbour] = true;
					queue.add(neighbour);
				}
			}
		}
	}
}
