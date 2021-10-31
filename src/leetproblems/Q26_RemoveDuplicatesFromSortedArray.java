package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q26_RemoveDuplicatesFromSortedArray {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int arr[] = new int[n], i;
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		System.out.println(removeDuplicates(arr));
	}

	// public int removeDuplicates(int[] nums) {
	// int len = nums.length, i, j, count = 0;
	// for (i = 0; i < nums.length - count - 1;) {
	// j = i + 1;
	// if (nums[i] == nums[j]) {
	// len--;
	// for (; j < nums.length - 1; j++)
	// nums[j] = nums[j + 1];
	// count++;
	// } else
	// i++;
	// }
	// return len;
	// }

	public static int removeDuplicates(int[] nums) {
		int index = 1;
		for (int i = 0; i < nums.length - 1; ++i) {
			if (nums[i] != nums[i + 1])
				nums[index++] = nums[i + 1];
		}
		return index;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
