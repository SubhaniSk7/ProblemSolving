package leetproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

public class Q1971_FindIfPathExistsInGraph {
	boolean[] visited;
	ArrayList<Set<Integer>> vertices;

	public boolean validPath(int n, int[][] edges, int start, int end) {
		if (start == end)
			return true;
		visited = new boolean[n];
		vertices = new ArrayList<Set<Integer>>(n);
		int size = edges.length;
		for (int i = 0; i < n; ++i) {
			Set<Integer> e = new HashSet<Integer>();
			vertices.add(e);
		}
		for (int i = 0; i < size; ++i) {
			int s = edges[i][0], d = edges[i][1];
			vertices.get(s).add(d);
			vertices.get(d).add(s);
		}

		return dfs(start, end);
	}

	public boolean dfs(int source, int end) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(source);
		visited[source] = true;
		while (!stack.isEmpty()) {
			source = stack.pop();
			Iterator<Integer> itr = vertices.get(source).iterator();
			while (itr.hasNext()) {
				int neighbour = itr.next();
				if (!visited[neighbour]) {
					if (neighbour == end)
						return true;
					visited[neighbour] = true;
					stack.push(neighbour);
				}
			}
		}
		return false;
	}
}
