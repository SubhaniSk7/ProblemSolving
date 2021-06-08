package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.StringTokenizer;

public class Q15_Three_3Sum {
	public static void main(String subhani[]) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());

		int[] nums = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			nums[i] = Integer.parseInt(st.nextToken());
		printArray(nums);

		threeSum(nums);
	}

	// TLE
//	public static List<List<Integer>> threeSum(int[] nums) {
//		Arrays.sort(nums);
//		HashSet<List<Integer>> result = new HashSet<List<Integer>>();
//		List<Integer> l;
//		int i, j, k;
//		for (i = 0; i < nums.length - 2; i++) {
//			for (j = i + 1; j < nums.length - 1; j++) {
//				for (k = j + 1; k < nums.length; k++) {
//					if (nums[i] + nums[j] + nums[k] == 0) {
//						l = new ArrayList<Integer>();
//						l.add(nums[i]);
//						l.add(nums[j]);
//						l.add(nums[k]);
//						result.add(l);
//					}
//				}
//			}
//		}
//		List<List<Integer>> ans = new ArrayList<>(result);
////		Iterator<List<Integer>> itr = ans.iterator();
////		while (itr.hasNext())
////			System.out.println(itr.next());
//
//		return ans;
//	}

	public static List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		HashSet<List<Integer>> result = new HashSet<List<Integer>>();
		List<Integer> l;
		int i, left, right;
		for (i = 0; i < nums.length - 1; i++) {
			left = i + 1;
			right = nums.length - 1;
			while (left < right) {
				int sum = nums[i] + nums[left] + nums[right];
				if (sum == 0) {
					l = new ArrayList<Integer>();
					l.add(nums[i]);
					l.add(nums[left]);
					l.add(nums[right]);
					result.add(l);
					left++;
					right--;
				} else if (sum < 0)
					left++;
				else
					right--;
			}
		}
		List<List<Integer>> ans = new ArrayList<>(result);
//		Iterator<List<Integer>> itr = ans.iterator();
//		while (itr.hasNext())
//			System.out.println(itr.next());
		return ans;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
