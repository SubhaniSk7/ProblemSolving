package basics.BST;

public class TreeInorderSuccessor {
	public TreeNode inorderSuccessor(TreeNode root, int element) {

		if (root == null) {
			System.out.println("Tree is Empty.");
			return null;
		}
		TreeNode successorNode = null;
		while (root != null) {
			if (root.getData() == element) {
				if (root.getRight() != null) {// find min in RST
					TreeFindMin treeFindMin=new TreeFindMin();
					successorNode=treeFindMin.minNode(root.getRight());
				}
				return successorNode;
			} else if (root.getData() < element)
				root = root.getRight();
			else {
				successorNode = root;
				root = root.getLeft();
			}
		}
		return successorNode;
	}
}
