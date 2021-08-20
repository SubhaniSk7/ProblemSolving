package interviewbit.treedatastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class PathToGivenNode {
	public static TreeNode root;
	static int val;

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();

		while (st.hasMoreTokens())
			al.add(Integer.parseInt(st.nextToken()));

		for (int i = 0; i < al.size(); ++i)
			insert(al.get(i));
		val = Integer.parseInt(br.readLine());
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
		ArrayList<Integer> al = path(root, val);
		System.out.println(al.toString());

		al = new ArrayList<Integer>();
		System.out.println(path_1(root, al, val));
		System.out.println(al.toString());
	}

	public static ArrayList<Integer> path(TreeNode A, int val) {// BST
		ArrayList<Integer> al = new ArrayList<>();
		TreeNode cur = A;
		boolean found = false;
		while (cur != null) {
			al.add(cur.val);
			if (cur.val == val) {
				found = true;
				break;
			} else if (cur.val > val)
				cur = cur.left;
			else
				cur = cur.right;
		}
		if (!found)
			return new ArrayList<Integer>();
		return al;
	}

	public static boolean path_1(TreeNode A, ArrayList<Integer> al, int val) {// Binary Tree //al is pass by reference
		if (A == null)
			return false;
		al.add(A.val);
		if (A.val == val)
			return true;
		if (path_1(A.left, al, val) || path_1(A.right, al, val))
			return true;

		al.remove(al.size() - 1);
		return false;
	}
}
