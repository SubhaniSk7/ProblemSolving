package leetproblems;

public class Q559_MaximumDepthOfNaryTree {
	public int maxDepth(Node root) {
		return depth(root);
	}

	public int depth(Node root) {
		if (root == null)
			return 0;
		int depth = 0;
		for (Node node : root.children)
			depth = Math.max(depth, maxDepth(node));
		return 1 + depth;
	}
}
