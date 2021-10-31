package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q118_PascalsTriangle {
	public List<List<Integer>> generate(int numRows) {
		List<List<Integer>> result = new ArrayList<>();
		ArrayList<Integer> al = new ArrayList<>();
		al.add(1);
		result.add(al);
		if (numRows == 1)
			return result;
		al = new ArrayList<>();
		al.add(1);
		al.add(1);
		result.add(al);
		for (int i = 2; i < numRows; ++i) {
			al = new ArrayList<>();
			al.add(1);
			for (int j = 1; j <= i - 1; ++j)
				al.add(result.get(i - 1).get(j) + result.get(i - 1).get(j - 1));
			al.add(1);
			result.add(al);
		}
		return result;
	}
}
