package leetproblems;

import java.util.ArrayList;

import basics.bst.TreeNode;

public class Q501_FindModeinBinarySearchTree {
	TreeNode prev = null;
	int count = 1, max = 0;

	public int[] findMode(TreeNode root) {
		ArrayList<Integer> modes = new ArrayList<>();
		inOrder(root, modes);
		int[] result = new int[modes.size()];
		int i = 0;
		for (int x : modes)
			result[i++] = x;
		return result;
	}

	public void inOrder(TreeNode root, ArrayList<Integer> modes) {
		if (root != null) {
			inOrder(root.left, modes);
			if (prev != null) {
				if (prev.val == root.val)
					count++;
				else
					count = 1;
			}
			if (count > max) {
				max = count;
				modes.clear();
				modes.add(root.val);
			} else if (count == max)
				modes.add(root.val);

			prev = root;
			inOrder(root.right, modes);
		}
	}
}
