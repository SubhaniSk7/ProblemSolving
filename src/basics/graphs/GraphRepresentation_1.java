package basics.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class GraphRepresentation_1 {

	public static int n, e; // n:#vertices, e:#edges
	public static int[][] adjMatrix;// type 1 data-structure
	public static ArrayList<Set<Integer>> vertices = new ArrayList<>();// type 2 data-structure
	public static ArrayList<Integer> v[];// type 3 data-structure
	public static Set<Integer> vert[];// type 4 data-structure

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());

		adjMatrix = new int[n][n];
		v = new ArrayList[n];
		vert = new Set[n];
		for (int i = 0; i < n; ++i) {
			vertices.add(new HashSet<Integer>());
			v[i] = new ArrayList<Integer>();
			vert[i] = new HashSet<Integer>();
		}

		for (int i = 0; i < e; ++i) {
			st = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(st.nextToken()), child = Integer.parseInt(st.nextToken());
			adjMatrix[parent][child] = 1;
			adjMatrix[child][parent] = 1;// undirected graph

			vertices.get(parent).add(child);
			vertices.get(child).add(parent);// undirected graph

			v[parent].add(child);
			v[child].add(parent);// undirected graph

			vert[parent].add(child);
			vert[child].add(parent);
		}
		printGraph();
	}

	public static void printGraph() {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(adjMatrix[i][j] + " ");
			System.out.println();
		}
		System.out.println("\nType-1 >> ArrayList(Set)");
		for (int i = 0; i < n; ++i)
			System.out.println(i + "-->" + vertices.get(i).toString());
		System.out.println("\nType-2 >> Array(ArrayList)");
		for (int i = 0; i < n; ++i)
			System.out.println(i + "-->" + v[i].toString());
		System.out.println("\nType-3 >> Array(Set)");
		for (int i = 0; i < n; ++i)
			System.out.println(i + "-->" + vert[i].toString());
	}
}

//5 7
//0 1
//0 4
//1 2
//1 3
//1 4
//2 3
//2 4
