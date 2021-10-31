package basics.graphs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class TopologicalSort {
	public static PrintStream out;
	public static BufferedReader br;
	public static GraphUtils utils = new GraphUtils();

	public static int n, e;
	public static ArrayList<Set<Integer>> vertices;
	public static boolean[] visited;
	public static Stack<Integer> order = new Stack<Integer>();

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(
				new FileReader("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\input.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(
				new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\output.txt", append),
				autoFlush);
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
		}
	}

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		visited = new boolean[n];
		utils.printGraph(vertices, out);
		topologicalSort();
		while (!order.isEmpty())
			System.out.print(order.pop() + " ");
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
			if (!visited[neighbour])
				dfs(neighbour);
		}
		order.push(source);
	}
}
