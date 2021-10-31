package leetproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q40_CombinationSumII {
	List<ArrayList<Integer>> result = new ArrayList<>();

	public List<ArrayList<Integer>> combinationSum2(int[] candidates, int target) {
		Arrays.sort(candidates);
		traverse(candidates, 0, target, new ArrayList<Integer>());
		return result;
	}

	public void traverse(int[] candidates, int index, int sum, ArrayList<Integer> cur) {
		if (sum == 0) {
			ArrayList<Integer> al = new ArrayList<>(cur);
			result.add(al);
			return;
		}
		if (sum < 0)
			return;
		for (int i = index; i < candidates.length; ++i) {
			if (i == index || candidates[i] != candidates[i - 1]) {
				cur.add(candidates[i]);
				traverse(candidates, i + 1, sum - candidates[i], cur);
				cur.remove(cur.size() - 1);
			}
		}
	}
}
