package basics.graphs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class BFS {
	public static PrintStream out;
	public static BufferedReader br;
	public static GraphUtils utils = new GraphUtils();

	public static int n, e;
	public static ArrayList<Set<Integer>> vertices;

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\input.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\output.txt", append), autoFlush);

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
	}

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		read();
		utils.printGraph(vertices, out);
		int src = 0;
		bfs(src);
	}

	public static void bfs(int source) {
		boolean[] visited = new boolean[n];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		visited[source] = true;
		while (!queue.isEmpty()) {
			source = queue.poll();
			out.print(source + " ");
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
