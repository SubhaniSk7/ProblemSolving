package leetproblems;

import basics.bst.TreeNode;

public class Q105_ConstructBinaryTreeFromPreorderAndInorderTraversal {
	public TreeNode buildTree(int[] preorder, int[] inorder) {
		return solve(0, 0, inorder.length - 1, preorder, inorder);
	}

	public TreeNode solve(int pStart, int iStart, int iEnd, int[] preorder, int[] inorder) {
		if (pStart >= preorder.length || iStart > iEnd)
			return null;
		TreeNode root = new TreeNode(preorder[pStart]);
		int index = 0;
		for (int i = iStart; i <= iEnd; ++i) {
			if (root.val == inorder[i])
				index = i;
		}
		root.left = solve(pStart + 1, iStart, index - 1, preorder, inorder);
		int lstSize = index - iStart;
		root.right = solve(pStart + lstSize + 1, index + 1, iEnd, preorder, inorder);
		return root;
	}
}
