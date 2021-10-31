package leetproblems;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class Q78_Subsets {
	List<List<Integer>> result = new ArrayList<>();
	TreeSet<String> set = new TreeSet<>();

	public List<List<Integer>> subsets(int[] nums) {
		dfs(nums, 0, new ArrayList<Integer>());
		return result;
	}

	public void dfs(int[] nums, int index, ArrayList<Integer> set) {
		if (index == nums.length) {
			result.add(new ArrayList<Integer>(set));
			return;
		}
		set.add(nums[index]);// include
		dfs(nums, index + 1, set);

		set.remove(set.size() - 1);// exclude
		dfs(nums, index + 1, set);
	}

//	public List<List<Integer>> subsets(int[] nums) {
//		subs(nums, 0, "");
//		Iterator<String> itr = set.iterator();
//		while (itr.hasNext()) {
//			String s = itr.next();
//			ArrayList<Integer> al = new ArrayList<>();
//			StringTokenizer st = new StringTokenizer(s);
//			while (st.hasMoreTokens())
//				al.add(Integer.parseInt("" + st.nextToken()));
//			result.add(al);
//		}
//		return result;
//	}
//
//	public void subs(int[] nums, int index, String ans) {
//		if (index == nums.length) {
//			set.add(ans);
//			return;
//		}
//		String a = ans + " " + nums[index];
//		String b = ans;
//		subs(nums, index + 1, a);
//		subs(nums, index + 1, b);
//	}
}
