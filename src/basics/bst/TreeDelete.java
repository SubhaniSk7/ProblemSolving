package basics.bst;

public class TreeDelete {
	public TreeNode delete(TreeNode root, int element) {
		if (root == null) {
			System.out.println("Tree is Empty.");
			return root;
		}
		if (element < root.val)
			root.left = delete(root.left, element);
		else if (element > root.val)
			root.right = delete(root.right, element);
		else {// equals
			if (root.left == null) // only right child
				return root.right;
			else if (root.right == null)// only left child
				return root.left;
			else {// have two children:left and right
				TreeInorderSuccessor inorderSuccessor = new TreeInorderSuccessor();
				root.val = inorderSuccessor.inorderSuccessor(root, root.val).val;
				root.right = delete(root.right, root.val);
			}
		}
		return root;
	}
}
