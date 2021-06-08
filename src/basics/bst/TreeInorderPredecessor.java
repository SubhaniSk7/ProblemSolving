package basics.bst;

public class TreeInorderPredecessor {
	public TreeNode inorderPredecessor(TreeNode root, int element) throws InterruptedException {
		if (root == null) {
			System.out.println("Tree is Empty.");
			return null;
		}
		TreeNode predecessorNode = null;
		while (root != null) {
			if (root.getData() == element) {
				if (root.getLeft() != null) {// find max in LST
					TreeFindMax treeFindMax = new TreeFindMax();
					predecessorNode = treeFindMax.maxNode(root.getLeft());
				}
				return predecessorNode;
			} else if (root.getData() < element) {
				predecessorNode = root;
				root = root.getRight();
			} else
				root = root.getLeft();
		}
		return predecessorNode;
	}
}
