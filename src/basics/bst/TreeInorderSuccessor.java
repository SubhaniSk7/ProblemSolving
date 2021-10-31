package basics.bst;

public class TreeInorderSuccessor {
	public TreeNode inorderSuccessor(TreeNode root, int element) {
		if (root == null) {
			System.out.println("Tree is Empty.");
			return null;
		}
		TreeNode successorNode = null;
		while (root != null) {
			if (root.val == element) {
				if (root.right != null) {// find min in RST
					TreeFindMin treeFindMin = new TreeFindMin();
					successorNode = treeFindMin.minNode(root.right);
				}
				return successorNode;
			} else if (root.val < element)
				root = root.right;
			else {
				successorNode = root;
				root = root.left;
			}
		}
		return successorNode;
	}
}
