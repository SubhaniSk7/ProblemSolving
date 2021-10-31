package leetproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q133_CloneGraph {
	HashMap<Integer, Node_graph> map = new HashMap<>();

	public Node_graph cloneGraph(Node_graph node) {
		return bfs(node);
	}

	public Node_graph bfs(Node_graph node) {
		if (node == null)
			return null;
		Node_graph newNode = new Node_graph(node.val);
		map.put(node.val, newNode);
		Queue<Node_graph> q = new LinkedList<>();
		q.add(node);
		while (!q.isEmpty()) {
			Node_graph cur = q.poll();
			for (Node_graph v : cur.neighbors) {
				if (!map.containsKey(v.val)) {
					map.put(v.val, new Node_graph(v.val));
					q.add(v);
				}
				map.get(cur.val).neighbors.add(map.get(v.val));
			}
		}
		return newNode;
	}
}

class Node_graph {
	public int val;
	public List<Node_graph> neighbors;

	public Node_graph() {
		val = 0;
		neighbors = new ArrayList<Node_graph>();
	}

	public Node_graph(int _val) {
		val = _val;
		neighbors = new ArrayList<Node_graph>();
	}

	public Node_graph(int _val, ArrayList<Node_graph> _neighbors) {
		val = _val;
		neighbors = _neighbors;
	}
}
