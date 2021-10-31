package basics.bst;

public class TreeFindMax {
	public int max(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return Integer.MAX_VALUE;
		}
		while (root.right != null)
			root = root.right;
		return root.val;
	}

	public TreeNode maxNode(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return root;
		}
		while (root.right != null)
			root = root.right;
		return root;
	}
}
