package basics.BST;

public class TreeInsert {
	public TreeNode insert(TreeNode root, int data) {
		TreeNode node = new TreeNode(data);
		if (root == null) {
			root = node;
		} else {
			TreeNode rootPtr = root;// current node pointer
			TreeNode temp;// temp Node to point prev
			while (true) {
				temp = rootPtr;
				if (data <= rootPtr.getData()) {// <=
					rootPtr = rootPtr.getLeft();
					if (rootPtr == null) {
						temp.setLeft(node);
						break;
					}
				} else {// >
					rootPtr = rootPtr.getRight();
					if (rootPtr == null) {
						temp.setRight(node);
						break;
					}
				}
			}
		}
		return root;
	}
}
