package basics.bst;

public class TreeInorderPredecessor {
	public TreeNode inorderPredecessor(TreeNode root, int element) throws InterruptedException {
		if (root == null) {
			System.out.println("Tree is Empty.");
			return null;
		}
		TreeNode predecessorNode = null;
		while (root != null) {
			if (root.val == element) {
				if (root.left != null) {// find max in LST
					TreeFindMax treeFindMax = new TreeFindMax();
					predecessorNode = treeFindMax.maxNode(root.left);
				}
				return predecessorNode;
			} else if (root.val < element) {
				predecessorNode = root;
				root = root.right;
			} else
				root = root.left;
		}
		return predecessorNode;
	}
}
