package basics.bst;

import java.util.Stack;

public class TreeTraversalsIterative {
	public void preOrder(TreeNode root) {
		TreeNode cur = root;
		Stack<TreeNode> s = new Stack<>();
		while (cur != null || !s.isEmpty()) {
			while (cur != null) {
				System.out.print(cur.val + " ");
				if (cur.right != null)
					s.push(cur.right);
				cur = cur.left;
			}
			if (!s.isEmpty())
				cur = s.pop();
		}
	}

	public void preOrder_1(TreeNode root) throws InterruptedException {
		TreeNode cur = root;
		Stack<TreeNode> s = new Stack<>();
		s.push(cur);
		while (!s.isEmpty()) {
			cur = s.pop();
			System.out.print(cur.val + " ");
			if (cur.right != null)
				s.push(cur.right);
			if (cur.left != null)
				s.push(cur.left);
		}
	}

	public void morris_preOrder(TreeNode root) {
		TreeNode cur = root;
		while (cur != null) {
			if (cur.left != null) {
				TreeNode pre = cur.left;
				while (pre.right != null && pre.right != cur)
					pre = pre.right;
				if (pre.right == null) {
					System.out.print(cur.val + " ");
					pre.right = cur;
					cur = cur.left;
				} else {
					pre.right = null;
					cur = cur.right;
				}
			} else {
				System.out.print(cur.val + " ");
				cur = cur.right;
			}
		}

	}
//	-----------------------------------------------------------------------------------

	public void inOrder(TreeNode root) {
		TreeNode cur = root;
		Stack<TreeNode> s = new Stack<>();
		while (cur != null || !s.isEmpty()) {
			while (cur != null) {
				s.push(cur);
				cur = cur.left;
			}
			if (!s.isEmpty())
				cur = s.pop();
			System.out.print(cur.val + " ");
			cur = cur.right;
		}
	}

	public void inOrder_1(TreeNode root) {
		TreeNode cur = root;
		Stack<TreeNode> s = new Stack<>();
		while (true) {
			if (cur != null) {
				s.push(cur);
				cur = cur.left;
			} else {
				if (s.isEmpty())
					break;
				cur = s.pop();
				System.out.print(cur.val + " ");
				cur = cur.right;
			}
		}
	}

	public void morris_inOrder(TreeNode root) {
		TreeNode cur = root;
		while (cur != null) {
			if (cur.left != null) {
				TreeNode pre = cur.left;
				while (pre.right != null && pre.right != cur)
					pre = pre.right;
				if (pre.right == null) {
					pre.right = cur;
					cur = cur.left;
				} else {
					pre.right = null;
					System.out.print(cur.val + " ");
					cur = cur.right;
				}
			} else {
				System.out.print(cur.val + " ");
				cur = cur.right;
			}
		}
	}

//	-----------------------------------------------------------------------------------

	public void postOrder(TreeNode root) throws InterruptedException {
		TreeNode cur = root;
		Stack<TreeNode> s1 = new Stack<>(), s2 = new Stack<>();
		s1.push(cur);
		while (!s1.isEmpty()) {
			cur = s1.pop();
			s2.push(cur);
			if (cur.left != null)
				s1.push(cur.left);
			if (cur.right != null)
				s1.push(cur.right);
		}
		while (!s2.isEmpty()) {
			cur = s2.pop();
			System.out.print(cur.val + " ");
		}
	}

	public void morris_postOrder(TreeNode root) {
		TreeNode cur = root;

	}
}
