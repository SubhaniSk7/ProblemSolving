package leetproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.TreeMap;

import basics.bst.TreeNode;

public class Q987_VerticalOrderTraversalOfABinaryTree {
	TreeMap<Integer, TreeMap<Integer, PriorityQueue<Integer>>> map = new TreeMap<>();

	public List<List<Integer>> verticalTraversal(TreeNode root) {
		dfs(root, 0, 0);
		List<List<Integer>> result = new ArrayList<>();
		int min = map.firstKey(), max = map.lastKey();
		for (int i = min; i <= max; ++i) {
			List<Integer> al = new ArrayList<>();
			for (int k : map.get(i).keySet()) {
				while (!map.get(i).get(k).isEmpty()) {
					al.add(map.get(i).get(k).poll());
				}
			}
			result.add(al);
		}
		return result;
	}

	public void dfs(TreeNode root, int x, int y) {
		if (root != null) {
			if (!map.containsKey(x))
				map.put(x, new TreeMap<>());
			if (!map.get(x).containsKey(y))
				map.get(x).put(y, new PriorityQueue<Integer>());
			map.get(x).get(y).add(root.val);
			dfs(root.left, x - 1, y + 1);
			dfs(root.right, x + 1, y + 1);
		}
	}
}
