package basics.graphs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class BellmanFord {// Shortest distance from source to destination
	static BufferedReader br;
	static PrintStream out;

	static int n, e;
	public static ArrayList<int[]> edges = new ArrayList<>();
	static ArrayList<Integer> distance = new ArrayList<>();
	static ArrayList<Integer> parent = new ArrayList<>();

	public static void read() throws IOException {
		br = new BufferedReader(new FileReader("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\input.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\output.txt", append), autoFlush);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());

		int src = 1;
		for (int i = 0; i <= n; ++i) {
			if (i == src) // src = 1
				parent.add(i);
			else
				parent.add(-1);
			distance.add(Integer.MAX_VALUE);
		}

		for (int i = 0; i < e; ++i) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());

			int[] ed = new int[] { u, v, w };
			edges.add(ed);
		}
	}

	public static void main(String[] subhani) throws IOException {
		read();
		shortestPath();

		int x = n;
		if (parent.get(x) == -1)
			out.print(-1);
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

	public static void shortestPath() {
		int src = 1;
		distance.set(src, 0);
		for (int i = 1; i <= n; ++i) {// generally n-1 times and extra 1 time for detecting -ve edge cycle
			for (int[] ed : edges) {
				int u = ed[0], v = ed[1], w = ed[2];
				if (distance.get(v) > distance.get(u) + w) {// relaxing edge
					distance.set(v, distance.get(u) + w);
					parent.set(v, u);
				}
			}
		}
	}
}
