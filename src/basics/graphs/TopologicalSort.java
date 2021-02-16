package basics.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class TopologicalSort {
	public static int n, e; // n:#vertices, e:#edges
	public static ArrayList<Set<Integer>> vertices;
	public static boolean[] visited;

	public static Stack<Integer> order = new Stack<Integer>();

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		vertices = new ArrayList<Set<Integer>>(n);
		visited = new boolean[n];

		for (int i = 0; i < n; ++i) {
			Set<Integer> edges = new HashSet<Integer>();
			vertices.add(edges);
		}

		for (int i = 0; i < e; ++i) {
			st = new StringTokenizer(br.readLine());
			int source = Integer.parseInt(st.nextToken()), destination = Integer.parseInt(st.nextToken());
			vertices.get(source).add(destination);
		}
		printGraph();
		topologicalSort();
		while (!order.isEmpty())
			System.out.print(order.pop() + " ");
	}

	public static void printGraph() {
		Iterator<Set<Integer>> itr = vertices.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
	}

	public static void topologicalSort() {
		for (int i = 0; i < n; ++i) {
			if (!visited[i])
				dfs(i);
		}
	}

	public static void dfs(int source) {
		visited[source] = true;
		Iterator<Integer> itr = vertices.get(source).iterator();
		while (itr.hasNext()) {
			int neighbour = itr.next();
			if (!visited[neighbour]) {
				dfs(neighbour);
			}
		}
		order.push(source);
	}
}
