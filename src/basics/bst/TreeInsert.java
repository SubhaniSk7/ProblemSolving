package basics.bst;

public class TreeInsert {
	public TreeNode insert(TreeNode root, int data) {
		TreeNode node = new TreeNode(data);
		if (root == null)
			root = node;
		else {
			TreeNode cur = root, prev;
			while (true) {
				prev = cur;
				if (data <= cur.val) {
					cur = cur.left;
					if (cur == null) {
						prev.left = node;
						break;
					}
				} else {
					cur = cur.right;
					if (cur == null) {
						prev.right = node;
						break;
					}
				}
			}
		}
		return root;
	}
}
