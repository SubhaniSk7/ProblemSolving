package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q448_FindAllNumbersDisappearedInAnArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
		List<Integer> result = new ArrayList<>();
		for (int i = 0; i < nums.length;) {
			int index = nums[i] - 1;
			if (nums[i] != nums[index]) {
				int temp = nums[i];
				nums[i] = nums[index];
				nums[index] = temp;
			} else
				i++;
		}
		for (int i = 0; i < nums.length; ++i) {
			if (i + 1 != nums[i])
				result.add(i + 1);
		}
		return result;
	}
}
