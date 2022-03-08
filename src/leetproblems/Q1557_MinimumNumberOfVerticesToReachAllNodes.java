package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q1557_MinimumNumberOfVerticesToReachAllNodes {
	public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
		List<Integer> result = new ArrayList<>();
		int[] count = new int[n];
		for (List<Integer> al : edges)
			count[al.get(1)]++;
		for (int i = 0; i < n; ++i) {
			if (count[i] == 0)
				result.add(i);
		}
		return result;
	}
}
