package basics.graphs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Prims {// MST - Minimal Spanning Tree
	static BufferedReader br;
	static PrintStream out;

	static int n, e;
	static ArrayList<int[]> edges = new ArrayList<>();
	static ArrayList<Integer> parent = new ArrayList<>();
	static int[][] adjMatrix;
	static boolean[] included;
	static int[] distance;

	static int cost = 0;

	public static void read() throws IOException {
		br = new BufferedReader(new FileReader("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\input.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\output.txt", append), autoFlush);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());// 0 -> n-1
		e = Integer.parseInt(st.nextToken());
		adjMatrix = new int[n][n];
		included = new boolean[n];
		distance = new int[n];
		parent = new ArrayList<>();

		for (int i = 0; i < e; ++i) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
			adjMatrix[u][v] = w;
			adjMatrix[v][u] = w;
		}
	}

	public static void main(String[] subhani) throws IOException {
		read();
		mst_prims();
		print();
	}

	public static void mst_prims() {
		for (int v = 0; v < n; ++v) {
			distance[v] = Integer.MAX_VALUE;
			included[v] = false;
			parent.add(v);
		}
		distance[0] = 0;// starting vertex

		for (int count = 1; count < n; ++count) {
			int u = minVertex();
			included[u] = true;
			for (int v = 0; v < n; ++v) {// neighbors--> weight != 0
				if (!included[v] && adjMatrix[u][v] != 0 && adjMatrix[u][v] < distance[v]) {
					parent.set(v, u);
					distance[v] = adjMatrix[u][v];
				}
			}
		}
	}

	public static int minVertex() {
		int min = Integer.MAX_VALUE, index = -1;
		for (int v = 0; v < n; ++v) {
			if (!included[v] && distance[v] < min) {
				min = distance[v];
				index = v;
			}
		}
		return index;
	}

	public static void print() {
		for (int i = 0; i < n; ++i) {
			cost += distance[i];
			out.println(i + " " + parent.get(i) + " " + adjMatrix[i][parent.get(i)]);
		}
		out.println("cost:" + cost);
	}
}
