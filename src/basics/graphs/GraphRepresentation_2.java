package basics.graphs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

class Node {
	public int value;
	public ArrayList<Node> children;
}

public class GraphRepresentation_2 {

	public static ArrayList<Node> vertices = new ArrayList<Node>();
	public static int n, edges;
	public static int[][] adjMatrix;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		edges = Integer.parseInt(st.nextToken());
		adjMatrix = new int[n][n];

		for (int i = 0; i < n; ++i) {
			Node node = new Node();
			node.value = i;
			node.children = new ArrayList<Node>();
			vertices.add(node);
		}
		for (int i = 0; i < edges; ++i) {
			st = new StringTokenizer(br.readLine());
			int parent = Integer.parseInt(st.nextToken()), child = Integer.parseInt(st.nextToken());
			adjMatrix[parent][child] = 1;
			adjMatrix[child][parent] = 1;

			Node v = vertices.get(parent);
			Node childNode = new Node();
			childNode.value = child;
			v.children.add(childNode);

			v = vertices.get(child);
			Node parentNode = new Node();
			parentNode.value = parent;
			v.children.add(parentNode);
		}
		printGraph();
	}

	public static void printGraph() {
		for (int i = 0; i < n; ++i) {
			for (int j = 0; j < n; ++j)
				System.out.print(adjMatrix[i][j] + " ");
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; ++i) {
			Node node = vertices.get(i);
			System.out.print(node.value + "-->");
			Iterator<Node> itr = node.children.iterator();
			while (itr.hasNext())
				System.out.print(itr.next().value + " ");
			System.out.println();
		}
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
