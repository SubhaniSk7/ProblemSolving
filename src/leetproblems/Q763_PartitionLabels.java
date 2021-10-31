package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q763_PartitionLabels {
	public List<Integer> partitionLabels(String s) {
		ArrayList<Integer> result = new ArrayList<>();
		int n = s.length();
		if (n == 0)
			return result;
		int[] last_indices = new int[26];
		for (int i = 0; i < n; ++i)
			last_indices[s.charAt(i) - 'a'] = i;

		int l = 0, r = 0;
		for (int i = 0; i < n; ++i) {
			r = Math.max(r, last_indices[s.charAt(i) - 'a']);
			if (i == r) {
				result.add(r - l + 1);
				l = r + 1;
			}
		}
		return result;
	}
}
