package leetproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q797_AllPathsFromSourceToTarget {
	int n;
	ArrayList<Set<Integer>> vertices = new ArrayList<>();
	List<List<Integer>> result = new ArrayList<>();

	// boolean[] visited;// acyclic--> not required
	public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
		n = graph.length;
		// visited = new boolean[n];
		for (int i = 0; i < n; ++i) {
			Set<Integer> edges = new HashSet<>();
			vertices.add(edges);
		}

		for (int i = 0; i < n; ++i) {
			if (graph[i].length > 0) {
				for (int j = 0; j < graph[i].length; ++j) {
					vertices.get(i).add(graph[i][j]);
				}
			}
		}
		dfs(0, n - 1, new ArrayList<Integer>());
		return result;
	}

	public void dfs(int source, int destination, ArrayList<Integer> cur) {
		// if(visited[source])
		// return;
		if (source == destination) {
			cur.add(source);
			result.add(new ArrayList<Integer>(cur));
			return;
		}

		// visited[source] = true;//
		cur.add(source);
		for (int x : vertices.get(source)) {
			dfs(x, destination, cur);
			cur.remove(cur.size() - 1);
		}
		// visited[source] = false;
	}
}
