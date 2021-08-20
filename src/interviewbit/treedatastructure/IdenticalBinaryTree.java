package interviewbit.treedatastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class IdenticalBinaryTree {

	public static TreeNode root1, root2;

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (st.hasMoreTokens())
			al.add(Integer.parseInt(st.nextToken()));

		for (int i = 0; i < al.size(); ++i)
			root1 = insert(al.get(i), root1);
		st = new StringTokenizer(br.readLine());

		al = new ArrayList<Integer>();
		while (st.hasMoreTokens())
			al.add(Integer.parseInt(st.nextToken()));

		for (int i = 0; i < al.size(); ++i)
			root2 = insert(al.get(i), root2);
	}

	public static TreeNode insert(int val, TreeNode root) {
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
		return root;
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
		inOrderTraversal(root1);
		System.out.println();
		inOrderTraversal(root2);
		System.out.println();
		System.out.println(isSameTree(root1, root2));
	}

	public static int isSameTree(TreeNode A, TreeNode B) {
		boolean flag = same(A, B);
		return flag ? 1 : 0;
	}

	public static boolean same(TreeNode A, TreeNode B) {
		if (A == null && B == null)
			return true;
		if (A != null && B != null && A.val == B.val)
			return same(A.left, B.left) && same(A.right, B.right);
		return false;
	}
}
