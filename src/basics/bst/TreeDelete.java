package basics.bst;

public class TreeDelete {
	public TreeNode delete(TreeNode root, int element) {

		if (root == null) {
			System.out.println("Tree is Empty.");
			return root;
		}

		if (element < root.getData())
			root.left = delete(root.getLeft(), element);
		else if (element > root.getData())
			root.right = delete(root.getRight(), element);
		else {// equals
			if (root.getLeft() == null) // only right child
				return root.getRight();
			else if (root.getRight() == null)// only left child
				return root.getLeft();
			else {// have two children:left and right
				TreeInorderSuccessor inorderSuccessor = new TreeInorderSuccessor();
				root.data = inorderSuccessor.inorderSuccessor(root, root.getData()).data;
				root.right = delete(root.right, root.data);
			}
		}
		return root;
	}
}

// 		50
// 30, 		70
//20,40,  60, 80
//after deletion observe preorder,inorder, postorder traversal

// first delete 20--> have no children(leaf)
// delete 30 --> have one child
// delete 50 --> have both children
