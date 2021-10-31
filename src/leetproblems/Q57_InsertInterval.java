package leetproblems;

import java.util.ArrayList;

public class Q57_InsertInterval {
	public int[][] insert(int[][] intervals, int[] newInterval) {
		int n = intervals.length;
		ArrayList<int[]> al = new ArrayList<>();
		int[] prev = newInterval.clone();
		for (int i = 0; i < n; ++i) {
			int[] cur = intervals[i];
			if (prev[1] < cur[0]) {
				al.add(prev);
				for (int x = i; x < n; ++x)
					al.add(intervals[x]);
				return al.toArray(new int[al.size()][]);
			} else if (prev[0] > cur[1])
				al.add(cur);
			else
				prev = new int[] { Math.min(prev[0], cur[0]), Math.max(prev[1], cur[1]) };
		}
		al.add(prev);
		return al.toArray(new int[al.size()][]);
	}

	public int[][] insert_1(int[][] intervals, int[] newInterval) {
		int n = intervals.length;
		ArrayList<int[]> al = new ArrayList<>();
		int[] prev = newInterval.clone();
		al.add(prev);
		for (int i = 0; i < n; ++i) {
			int[] cur = intervals[i];
			if (prev[0] == cur[0]) {
				prev[1] = Math.max(prev[1], cur[1]);
			} else if (prev[0] > cur[0]) {
				if (cur[1] < prev[0]) {
					al.remove(al.size() - 1);
					al.add(cur);
					al.add(prev);
				} else {
					prev[0] = cur[0];
					prev[1] = Math.max(prev[1], cur[1]);
				}
			} else if (prev[0] < cur[0]) {
				if (prev[1] < cur[0]) {
					al.add(cur);
					prev = cur;
				} else 
					prev[1] = Math.max(prev[1], cur[1]);
			}
		}
		return al.toArray(new int[al.size()][]);
	}
}
