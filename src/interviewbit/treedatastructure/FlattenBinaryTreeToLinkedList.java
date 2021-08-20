package interviewbit.treedatastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class FlattenBinaryTreeToLinkedList {
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
		solve(root);
		inOrderTraversal(root);
	}

	public static void solve(TreeNode head) {
		TreeNode node = head;
		while (node != null) {
			TreeNode left = node.left;
			TreeNode right = node.right;
			if (left != null) {
				TreeNode temp = left;
				while (temp.right != null)
					temp = temp.right;
				temp.right = right;
				node.right = left;
				node.left = null;
			}
			node = node.right;
		}
	}
}
