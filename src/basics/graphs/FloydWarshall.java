package basics.graphs;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.StringTokenizer;

public class FloydWarshall {// Shortest Distance between two nodes
	static BufferedReader br;
	static PrintStream out;

	static int n, e;
	static long[][] distance;
	static int[][] adjMatrix;

	public static void read() throws IOException {
		br = new BufferedReader(new FileReader("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\input.txt"));
		boolean append = false, autoFlush = true;
		out = new PrintStream(new FileOutputStream("F:\\Git Space\\CompetitiveCoding\\src\\basics\\graphs\\output.txt", append), autoFlush);

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());

		distance = new long[n + 1][n + 1];
		adjMatrix = new int[n + 1][n + 1];
		for (int i = 0; i < e; ++i) {
			st = new StringTokenizer(br.readLine());
			int u = Integer.parseInt(st.nextToken()), v = Integer.parseInt(st.nextToken()), w = Integer.parseInt(st.nextToken());
			adjMatrix[u][v] = w;
			adjMatrix[v][u] = w;
		}
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j) {
				if (i == j)
					distance[i][j] = 0;
				else if (adjMatrix[i][j] != 0)
					distance[i][j] = adjMatrix[i][j];
				else
					distance[i][j] = Integer.MAX_VALUE;
			}
		}
	}

	public static void main(String[] subhani) throws IOException {
		read();
		shortestPath();
		print();
	}

	public static void shortestPath() {
		for (int k = 1; k <= n; ++k) {
			for (int i = 1; i <= n; ++i) {
				for (int j = 1; j <= n; ++j) {
					distance[i][j] = Math.min(distance[i][j], distance[i][k] + distance[k][j]);
				}
			}
		}
	}

	public static void print() {
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n; ++j)
				out.print(distance[i][j] + " ");
			out.println();
		}
	}
}
