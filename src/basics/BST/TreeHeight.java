package basics.BST;

public class TreeHeight {
	public int height(TreeNode node) {
		if (node == null) {
			return 0;
		} else {
			int leftSubHeight = height(node.getLeft());
			int rightSubHeight = height(node.getRight());

			if (leftSubHeight > rightSubHeight)
				return leftSubHeight + 1;// left subtree height + root
			else
				return rightSubHeight + 1;// right subtree height + root
		}
	}
}
