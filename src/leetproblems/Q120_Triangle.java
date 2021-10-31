package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q120_Triangle {
	public int minimumTotal(List<List<Integer>> triangle) {
		int m = triangle.size();
		ArrayList<ArrayList<Integer>> dp = new ArrayList<>();
		for (int r = m - 1; r >= 0; --r) {
			if (r == m - 1) {
				dp.add(new ArrayList<Integer>(triangle.get(m - 1)));
			} else {
				ArrayList<Integer> al = new ArrayList<>();
				int n = triangle.get(r).size();
				for (int c = 0; c < n; c++) {
					int next = dp.size() - 1;
					int min = triangle.get(r).get(c) + Math.min(dp.get(next).get(c), dp.get(next).get(c + 1));
					al.add(min);
				}
				dp.add(al);
			}
		}
		return dp.get(m - 1).get(0);
	}
}
