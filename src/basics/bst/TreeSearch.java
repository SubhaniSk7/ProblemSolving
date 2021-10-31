package basics.bst;

public class TreeSearch {
	public boolean search(TreeNode root, int element) {
		boolean found = false;
		while (root != null && found == false) {
			if (element == root.val) {
				found = true;
				break;
			} else if (element < root.val)
				root = root.left;
			else // element > root.getData()
				root = root.right;
		}
		return found;
	}

	public TreeNode searchNode(TreeNode root, int element) {
		boolean found = false;
		while (root != null && found == false) {
			if (element == root.val) {
				found = true;
				break;
			} else if (element < root.val)
				root = root.left;
			else // element > root.getData()
				root = root.right;
		}
		if (found)
			return root;
		else
			return null;
	}
}
