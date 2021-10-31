package leetproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Q56_MergeIntervals {
	public int[][] merge(int[][] intervals) {
		int n = intervals.length;
		if (n == 1)
			return intervals;

		Arrays.sort(intervals, (arr1, arr2) -> Integer.compare(arr1[0], arr2[0]));
		ArrayList<int[]> list = new ArrayList<>();
		list.add(intervals[0]);
		int[] prev = intervals[0];
		for (int i = 1; i < n; ++i) {
			int[] cur = intervals[i];
			if (prev[1] >= cur[0]) {
				prev[1] = Math.max(prev[1], cur[1]);
			} else {
				list.add(cur);
				prev = cur;
			}
		}
		return list.toArray(new int[list.size()][]);
	}
}
