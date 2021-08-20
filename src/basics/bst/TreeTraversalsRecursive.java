package basics.bst;

import java.util.LinkedList;
import java.util.Queue;

public class TreeTraversalsRecursive {
	public void preOrder(TreeNode root) {
		if (root != null) {
			System.out.print(root.getData() + " ");
			preOrder(root.getLeft());
			preOrder(root.getRight());
		}
	}

	public void inOrder(TreeNode root) {
		if (root != null) {
			inOrder(root.getLeft());
			System.out.print(root.getData() + " ");
			inOrder(root.getRight());
		}
	}

	public void postOrder(TreeNode root) {
		if (root != null) {
			postOrder(root.getLeft());
			postOrder(root.getRight());
			System.out.print(root.getData() + " ");
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
					System.out.print(temp.getData() + " ");
					if (temp.getLeft() != null)
						queue.offer(temp.getLeft());
					if (temp.getRight() != null)
						queue.offer(temp.getRight());
				} else {
					if (!queue.isEmpty())
						queue.offer(null);
				}
			}
		}
	}
}