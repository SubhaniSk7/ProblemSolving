package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EURON_EuronProblem {
	static BufferedReader br;
	static long count = 0;

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] nums = new int[n];
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		mergeSort(nums, 0, n - 1);
		System.out.println(count);
	}

	public static void mergeSort(int[] nums, int start, int end) {
		if (start < end) {
			int mid = start + (end - start) / 2;
			mergeSort(nums, start, mid);
			mergeSort(nums, mid + 1, end);
			merge(nums, start, mid, end);
		}
	}

	public static void merge(int[] nums, int start, int mid, int end) {
		int n1 = mid - start + 1, n2 = end - mid, i, j, k;
		int[] left = new int[n1];
		int[] right = new int[n2];
		for (i = 0; i < n1; i++)
			left[i] = nums[i + start];
		for (j = 0; j < n2; j++)
			right[j] = nums[mid + 1 + j];
		i = 0;
		j = 0;
		k = start;
		while (i < n1 && j < n2) {
			if (left[i] <= right[j]) {
				nums[k++] = left[i++];
			} else {
				count += n1 - i;
				nums[k++] = right[j++];
			}
		}
		while (i < n1)
			nums[k++] = left[i++];
		while (j < n2)
			nums[k++] = right[j++];
	}
}
