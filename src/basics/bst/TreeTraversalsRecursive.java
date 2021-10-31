package basics.bst;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversalsRecursive {
	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.val + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.left);
			System.out.print(root.val + " ");
			inOrder(root.right);
		}
	}

	public void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.val + " ");
		}
	}

	public void levelOrder(TreeNode root) {
		if (root == null) {
			System.out.println("Tree is Empty..");
		} else {
			Queue<TreeNode> queue = new LinkedList<TreeNode>();
			queue.offer(root);
			queue.offer(null);
			while (!queue.isEmpty()) {
				TreeNode temp = queue.poll();
				if (temp != null) {
					System.out.print(temp.val + " ");
					if (temp.left != null)
						queue.offer(temp.left);
					if (temp.right != null)
						queue.offer(temp.right);
				} else {
					if (!queue.isEmpty())
						queue.offer(null);
				}
			}
		}
	}

	public ArrayList<ArrayList<Integer>> levelOrder_1(TreeNode root) {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();
		if (root == null) {
			System.out.println("Tree is Empty..");
			return result;
		}
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(root);
		while (!q.isEmpty()) {
			int size = q.size();
			ArrayList<Integer> al = new ArrayList<>();
			while (size-- > 0) {
				TreeNode cur = q.poll();
				al.add(cur.val);
				if (cur.left != null)
					q.offer(cur.left);
				if (cur.right != null)
					q.offer(cur.right);
			}
			result.add(al);
		}
		return result;
	}
}