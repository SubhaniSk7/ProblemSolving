package lc.problems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q27_RemoveElement {

	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			nums[i] = Integer.parseInt(st.nextToken());

		int val = Integer.parseInt(br.readLine());

		System.out.println(removeElement(nums, val));
	}

	public static int removeElement(int[] nums, int val) {
		int i, j;
		for (i = 0; i < nums.length - 1; i++) {
			if (nums[i] == val) {
				for (j = i + 1; j < nums.length; j++) {
					if (nums[j] != val) {
						int temp = nums[i];
						nums[i] = nums[j];
						nums[j] = temp;
						break;
					}
//					printArray(nums);
				}
//				System.out.println(i + "::" + j + "--\n");
//				printArray(nums);
			}
		}
		i = nums.length - 1;
		while (i >= 0 && nums[i] == val)
			i--;
//		printArray(nums);
		if (i < 0)
			return 0;
		return i + 1;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println("\n------------------------");
	}
}
