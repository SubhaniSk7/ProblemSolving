package basics.bst;

public class TreeFindMin {
	public int min(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return Integer.MIN_VALUE;
		}
		while (root.left != null)
			root = root.left;
		return root.val;
	}

	public TreeNode minNode(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return null;
		}
		while (root.left != null)
			root = root.left;
		return root;
	}
}
