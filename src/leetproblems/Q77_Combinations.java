package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q77_Combinations {
	List<List<Integer>> result = new ArrayList<>();

	public List<List<Integer>> combine(int n, int k) {
		rec(n, k, 1, new ArrayList<Integer>());
		return result;
	}

	public void rec(int n, int k, int start, ArrayList<Integer> al) {
		if (al.size() == k) {
			result.add(new ArrayList<Integer>(al));
			return;
		}
		for (int i = start; i <= n; ++i) {
			al.add(i);
			rec(n, k, i + 1, al);
			al.remove(al.size() - 1);
		}
	}
}
