package leetproblems;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Q297_SerializeAndDeserializeBinaryTree {

	// Encodes a tree to a single string.
	StringBuilder sb = new StringBuilder();

	public String serialize(TreeNode root) {
		preOrder(root);
		return sb.toString();
	}

	public void preOrder(TreeNode root) {
		if (root == null) {
			sb.append("X").append(",");
		} else {
			sb.append(root.val).append(",");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	// Decodes your encoded data to tree.
	public TreeNode deserialize(String data) {
		Queue<String> q = new LinkedList<>();
		q.addAll(Arrays.asList(data.split(",")));

		return decode(q);
	}

	public TreeNode decode(Queue<String> q) {
		String val = q.poll();
		if (val.equals("X")) {
			return null;
		} else {
			TreeNode root = new TreeNode(Integer.parseInt(val));
			root.left = decode(q);
			root.right = decode(q);
			return root;
		}
	}

	private class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
}
