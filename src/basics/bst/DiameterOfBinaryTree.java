package basics.bst;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DiameterOfBinaryTree {
	public TreeNode root;
	int result = 0;

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		DiameterOfBinaryTree obj = new DiameterOfBinaryTree();
		Tree tree = new Tree();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens())
			tree.root = new TreeInsert().insert(tree.root, Integer.parseInt(st.nextToken()));

		System.out.println(obj.diameterOfBinaryTree_1(tree.root));
	}

	public int diameterOfBinaryTree_1(TreeNode root) {
		cal_1(root);
		return result - 1;
	}

	public int cal_1(TreeNode root) {
		if (root == null)
			return 0;
		int l = cal_1(root.left);
		int r = cal_1(root.right);

		int temp = 1 + Math.max(l, r);
		int res = Math.max(temp, l + r + 1);
		result = Math.max(result, res);
		return temp;
	}

//-------------------------------------------------------
	public int diameterOfBinaryTree_2(TreeNode root) {// Errichto
		Pair ans = dfs(root);
		return ans.diameter;
	}

	public Pair dfs(TreeNode root) {
		if (root == null)
			return new Pair(0, 0);
		Pair l = dfs(root.left);
		Pair r = dfs(root.right);

		int diameter = Math.max(l.height + r.height, Math.max(l.diameter, r.diameter));
		int height = 1 + Math.max(l.height, r.height);
		return new Pair(diameter, height);
	}
}

class Pair {
	int diameter, height;

	public Pair() {
	}

	public Pair(int x, int y) {
		diameter = x;
		height = y;
	}
}
//4 5 2 3 1