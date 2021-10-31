package interviewbit.treedatastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class LowestCommonAncestor {
	public static TreeNode root;
	static int n, m;

	public static void read() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<Integer> al = new ArrayList<Integer>();
		while (st.hasMoreTokens())
			al.add(Integer.parseInt(st.nextToken()));

		for (int i = 0; i < al.size(); ++i)
			insert(al.get(i));
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
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
		int result = lca(root, n, m);
		System.out.println(result);
		ArrayList<Boolean> flag = new ArrayList<>();
		flag.add(false);
		flag.add(false);
		TreeNode res = solve(root, flag, n, m);
		if (flag.get(0) && flag.get(1))
			System.out.println(res.val);
		else
			System.out.println(-1);
	}

	public static int lca(TreeNode A, int B, int C) {
		ArrayList<Integer> bal = new ArrayList<>(), cal = new ArrayList<>();
		if (!path(A, bal, B) || !path(A, cal, C))
			return -1;
		int i = 0;
		for (i = 0; i < bal.size() && i < cal.size(); ++i) {
			if (bal.get(i) != cal.get(i))
				break;
		}
		return bal.get(i - 1);
	}

	public static boolean path(TreeNode A, ArrayList<Integer> al, int n) {
		if (A == null)
			return false;

		al.add(A.val);
		if (A.val == n)
			return true;
		if (A.left != null && path(A.left, al, n))
			return true;
		if (A.right != null && path(A.right, al, n))
			return true;
		al.remove(al.size() - 1);
		return false;
	}

	public static TreeNode solve(TreeNode A, ArrayList<Boolean> al, int B, int C) {
		if (A == null)
			return null;
		TreeNode temp = null;
		if (A.val == B) {
			al.set(0, true);
			temp = A;
		}
		if (A.val == C) {
			al.set(1, true);
			temp = A;
		}
		TreeNode left = solve(A.left, al, B, C);
		TreeNode right = solve(A.right, al, B, C);

		if (temp != null)
			return temp;
		if (left != null && right != null)
			return A;

		return left != null ? left : right;
	}
}
