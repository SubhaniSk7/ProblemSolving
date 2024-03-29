package leetproblems;

import java.util.ArrayList;
import java.util.Arrays;

public class Q350_IntersectionOfTwoArraysII {
	public int[] intersect(int[] nums1, int[] nums2) {
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		int i = 0, j = 0;
		ArrayList<Integer> al = new ArrayList<>();
		while (i < nums1.length && j < nums2.length) {
			if (nums1[i] == nums2[j]) {
				al.add(nums1[i]);
				i++;
				j++;
			} else if (nums1[i] < nums2[j])
				i++;
			else
				j++;
		}
		int[] result = new int[al.size()];
		i = 0;
		for (int x : al)
			result[i++] = x;
		return result;
	}
}
