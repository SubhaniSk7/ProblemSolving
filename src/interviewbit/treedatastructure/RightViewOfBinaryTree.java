package interviewbit.treedatastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class RightViewOfBinaryTree {
	public static TreeNode root;

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();

		while (st.hasMoreTokens())
			al.add(Integer.parseInt(st.nextToken()));

		for (int i = 0; i < al.size(); ++i)
			insert(al.get(i));
	}

	public static void insert(int val) {
		TreeNode newNode = new TreeNode(val);
		if (root == null) {
			root = newNode;
		} else {
			TreeNode cur = root, temp;
			while (true) {
				temp = cur;
				if (val <= cur.val) {
					cur = cur.left;
					if (cur == null) {
						temp.left = newNode;
						break;
					}
				} else {
					cur = cur.right;
					if (cur == null) {
						temp.right = newNode;
						break;
					}
				}
			}
		}
	}

	public static void inOrderTraversal(TreeNode node) {
		if (node != null) {
			inOrderTraversal(node.left);
			System.out.print(node.val + " ");
			inOrderTraversal(node.right);
		}
	}

	public static void main(String subhani[]) throws IOException {
		read();
		inOrderTraversal(root);
		System.out.println();
		System.out.println(solve(root).toString());
	}

	public static ArrayList<Integer> solve(TreeNode A) {
		ArrayList<Integer> al = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(A);

		while (!q.isEmpty()) {
			int n = q.size();
			for (int i = 0; i < n; ++i) {
				TreeNode node = q.poll();
				if (i == 0)
					al.add(node.val);
				if (node.right != null)
					q.offer(node.right);
				if (node.left != null)
					q.offer(node.left);
			}
		}
		return al;
	}

	public static ArrayList<Integer> solve_1(TreeNode A) {
		ArrayList<Integer> al = new ArrayList<>();
		Queue<TreeNode> q = new LinkedList<>();
		q.offer(A);
		q.offer(null);

		while (!q.isEmpty()) {
			TreeNode node = q.peek();
			if (node != null) {
				al.add(node.val);
				while (q.peek() != null) {

					if (node.right != null)
						q.offer(node.right);
					if (node.left != null)
						q.offer(node.left);
					q.remove();
					node = q.peek();
				}
				q.offer(null);
			}
			q.remove();
		}
		return al;
	}

}
