package basics.BST;

public class TreeFindMin {
	public int min(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return Integer.MIN_VALUE;
		}
		while (root.getLeft() != null)
			root = root.getLeft();
		return root.getData();
	}

	public TreeNode minNode(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is empty.");
			return null;
		}
		while (root.getLeft() != null)
			root = root.getLeft();
		return root;
	}
}
