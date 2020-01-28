package basics.BST;

public class TreeFindMax {
	public int max(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return Integer.MAX_VALUE;
		}
		while (root.getRight() != null)
			root = root.getRight();
		return root.getData();
	}

	public TreeNode maxNode(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return root;
		}
		while (root.getRight() != null)
			root = root.getRight();
		return root;
	}
}
