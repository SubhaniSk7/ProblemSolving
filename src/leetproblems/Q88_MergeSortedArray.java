package leetproblems;

public class Q88_MergeSortedArray {
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		if (n == 0)
			return;
		if (m == 0) {
			for (int i = 0; i < n; ++i)
				nums1[i] = nums2[i];
			return;
		}
		int r = m + n - 1;
		int i = m - 1, j = n - 1;
		while (i >= 0 || j >= 0) {
			if (i < 0) {
				nums1[r] = nums2[j];
				j--;
			} else if (j < 0) {
				nums1[r] = nums1[i];
				i--;
			} else if (nums1[i] < nums2[j]) {
				nums1[r] = nums2[j];
				j--;
			} else {
				nums1[r] = nums1[i];
				i--;
			}
			r--;
		}
	}
}
