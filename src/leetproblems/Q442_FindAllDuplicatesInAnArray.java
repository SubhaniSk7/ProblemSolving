package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q442_FindAllDuplicatesInAnArray {
	public static void main(String[] subhani) {
		int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };
		Q442_FindAllDuplicatesInAnArray obj = new Q442_FindAllDuplicatesInAnArray();
		System.out.println(obj.findDuplicates(nums).toString());
	}

	public List<Integer> findDuplicates(int[] nums) {// swap sort
		int n = nums.length;
		for (int i = 0; i < n;) {
			int index = nums[i] - 1;
			if (nums[i] != nums[index]) {
				int temp = nums[i];
				nums[i] = nums[index];
//				nums[temp - 1] = temp;
				nums[index] = temp;
			} else
				i++;
		}
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			if (nums[i] - 1 != i)
				result.add(nums[i]);
		}
		return result;
	}

	public List<Integer> findDuplicates_1(int[] nums) {// swap sort
		int n = nums.length;
		ArrayList<Integer> result = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] < 0)
				result.add(index + 1);
			nums[index] = -nums[index];
		}
		return result;
	}
}
