package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q39_CombinationSum {// Order does matter
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> combinationSum(int[] candidates, int target) {// here given distinct elements
		if (candidates.length == 0)
			return result;
		rec(candidates, target, 0, new ArrayList<Integer>());
		return result;
	}

	public void rec(int[] candidates, int target, int index, ArrayList<Integer> cur) {
		if (target == 0) {
			result.add(new ArrayList<>(cur));
			return;
		}
		if (target < 0)
			return;
		for (int i = index; i < candidates.length; ++i) {
			cur.add(candidates[i]);
			rec(candidates, target - candidates[i], i, cur);
			cur.remove(cur.size() - 1);
		}
	}
}
