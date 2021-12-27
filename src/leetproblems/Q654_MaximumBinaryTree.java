package leetproblems;

import basics.bst.TreeNode;

public class Q654_MaximumBinaryTree {
	public TreeNode constructMaximumBinaryTree(int[] nums) {
		return build(nums, 0, nums.length - 1);
		// return build(nums);
	}

	public TreeNode build(int[] nums, int start, int end) {
		if (start > end)
			return null;
		int maxIndex = start;
		for (int i = start; i <= end; ++i) {
			if (nums[maxIndex] < nums[i])
				maxIndex = i;
		}
		TreeNode root = new TreeNode(nums[maxIndex]);
		root.left = build(nums, start, maxIndex - 1);
		root.right = build(nums, maxIndex + 1, end);
		return root;
	}

	// public TreeNode build(int[] nums){
	// Deque<TreeNode> stack = new LinkedList<>();//deque
	// for(int i = 0; i < nums.length; ++i){
	// TreeNode cur = new TreeNode(nums[i]);
	// while(!stack.isEmpty() && stack.peek().val < nums[i]){
	// cur.left = stack.pop();
	// }
	// if(!stack.isEmpty()){
	// stack.peek().right = cur;
	// }
	// stack.push(cur);
	// }
	// return stack.isEmpty() ? null : stack.removeLast();
	// }
}
