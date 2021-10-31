package leetproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q1200_MinimumAbsoluteDifference {
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
		Arrays.sort(arr);
		int n = arr.length, diff = Integer.MAX_VALUE;
		for (int i = 1; i < n; ++i)
			diff = Math.min(diff, arr[i] - arr[i - 1]);
		List<List<Integer>> result = new ArrayList<>();
		for (int i = 1; i < n; ++i) {
			if (arr[i] - arr[i - 1] == diff) {
				ArrayList<Integer> al = new ArrayList<>();
				al.add(arr[i - 1]);
				al.add(arr[i]);
				result.add(al);
			}
		}
		return result;
	}
}
