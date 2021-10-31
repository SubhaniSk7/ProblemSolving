package basics.bst;

public class TreeHeight {
	public int height(TreeNode node) {
		if (node == null)
			return 0;
		int l = height(node.left);
		int r = height(node.right);

		return 1 + Math.max(l, r);
	}
}
