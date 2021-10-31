package leetproblems;

import java.util.ArrayList;
import java.util.Iterator;

import basics.bst.TreeNode;

public class Q938_RangeSumOfBST {
	public int rangeSumBST(TreeNode root, int low, int high) {
		ArrayList<Integer> order = new ArrayList<>();
		int sum = 0;
		path(root, order);
		Iterator<Integer> itr = order.iterator();
		while (itr.hasNext()) {
			int val = itr.next();
			if (low <= val && val <= high)
				sum += val;
		}
		return sum;
	}

	public void path(TreeNode root, ArrayList<Integer> order) {
		if (root != null) {
			path(root.left, order);
			order.add(root.val);
			path(root.right, order);
		}
	}
}
