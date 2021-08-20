package codeforces;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.StringTokenizer;

class Node implements Comparator<Node> {
	public int node;
	public int cost;

	public Node() {
	}

	public Node(int node, int cost) {
		this.node = node;
		this.cost = cost;
	}

	@Override
	public int compare(Node o1, Node o2) {
		if (o1.cost > o2.cost)
			return 1;
		else if (o1.cost < o2.cost)
			return -1;
		else
			return 0;
	}

	@Override
	public String toString() {
		return "<" + this.node + " " + this.cost + ">";
	}
}

public class P20C_Dijkstra {
	public static ArrayList<ArrayList<Node>> adj = new ArrayList<>();
	public static ArrayList<Integer> distance = new ArrayList<>();
	public static Set<Integer> set = new HashSet<Integer>();
	public static PriorityQueue<Node> pq;
	public static ArrayList<Integer> parent = new ArrayList<>();

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken());
		distance = new ArrayList<Integer>();
		for (int i = 0; i <= n; ++i) {
			ArrayList<Node> al = new ArrayList<>();
			adj.add(al);

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

			Node node = new Node(v, w);
			adj.get(u).add(node);
			node = new Node(u, w);
			adj.get(v).add(node);
		}
//		System.out.println(adj.toString());
		shortestPath(n, m);
	}

	public static void shortestPath(int n, int m) {
		pq = new PriorityQueue<Node>(n, new Node());
		int src = 1;
		pq.offer(new Node(src, distance.get(src)));
		while (set.size() != n) {
			if (pq.isEmpty())
				break;
			Node u = pq.poll();
			if (set.contains(u.node))
				continue;
			set.add(u.node);
			relaxEdge(u.node);
		}
		printPath(1, n);
	}

	public static void relaxEdge(int u) {
		for (Node v : adj.get(u)) {
			if (!set.contains(v.node)) {
				int newDistance = distance.get(u) + v.cost;
				if (distance.get(v.node) > newDistance) {
					distance.set(v.node, newDistance);
					parent.set(v.node, u);
				}
				pq.offer(new Node(v.node, distance.get(v.node)));
			}
		}
	}

	public static void printPath(int src, int dest) {
//		System.out.println(distance.toString());
		int x = dest;
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
}
