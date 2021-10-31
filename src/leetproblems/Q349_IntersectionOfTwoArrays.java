package leetproblems;

import java.util.HashSet;
import java.util.Set;

public class Q349_IntersectionOfTwoArrays {
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<>();
		Set<Integer> ans = new HashSet<>();
		for (int x : nums1)
			set.add(x);
		for (int x : nums2) {
			if (set.contains(x))
				ans.add(x);
		}
		int[] result = new int[ans.size()];
		int i = 0;
		for (int x : ans)
			result[i++] = x;
		return result;
	}
}
