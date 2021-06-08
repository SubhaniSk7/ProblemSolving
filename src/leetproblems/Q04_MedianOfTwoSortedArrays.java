package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q04_MedianOfTwoSortedArrays {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), i;
		int a[] = new int[n], b[] = new int[m];
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			a[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < m; i++)
			b[i] = Integer.parseInt(st.nextToken());
		printArray(a);
		printArray(b);
		System.out.println(findMedianSortedArrays(a, b));
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int l = nums1.length + nums2.length;
		int[] c = new int[l];
		int i = 0, j = 0, k = 0;
		while (j < nums1.length && k < nums2.length) {
			if (nums1[j] <= nums2[k])
				c[i++] = nums1[j++];
			else
				c[i++] = nums2[k++];
		}
		while (j < nums1.length)
			c[i++] = nums1[j++];
		while (k < nums2.length)
			c[i++] = nums2[k++];

		int median = c[l / 2];
		if (l % 2 == 0)
			return (double) (median + c[(l - 1) / 2]) / 2;
		else
			return median;
	}
}
