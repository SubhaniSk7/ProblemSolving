package basics.BST;

public class TreeSearch {
	public boolean search(TreeNode root, int element) {
		boolean found = false;
		while (root != null && found == false) {
			if (element == root.getData()) {
				found = true;
				break;
			} else if (element < root.getData())
				root = root.getLeft();
			else // element > root.getData()
				root = root.getRight();
		}
		return found;
	}

	public TreeNode searchNode(TreeNode root, int element) {
		boolean found = false;
		while (root != null && found == false) {
			if (element == root.getData()) {
				found = true;
				break;
			} else if (element < root.getData())
				root = root.getLeft();
			else // element > root.getData()
				root = root.getRight();
		}
		if (found)
			return root;
		else
			return null;
	}
}
