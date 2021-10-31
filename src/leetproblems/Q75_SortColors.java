package leetproblems;

public class Q75_SortColors {
	public void sortColors(int[] nums) {
		int n = nums.length, r = 0, i = 0;
		for (i = 0; i < n; ++i) {
			if (nums[i] != 0) {
				r = i + 1;
				while (r < n && nums[r] != 0)
					r++;
				if (r >= n)
					break;
				else {
					int temp = nums[i];
					nums[i] = 0;
					nums[r] = temp;
				}
			}
			if (r >= n)
				break;
		}
		r = i + 1;
		for (; i < n; ++i) {
			if (nums[i] != 1) {
				r = i + 1;
				while (r < n && nums[r] != 1)
					r++;
				if (r >= n)
					break;
				else {
					int temp = nums[i];
					nums[i] = 1;
					nums[r] = temp;
				}
			}
			if (r >= n)
				break;
		}
	}

	public void sortColors_1(int[] nums) {
		int n = nums.length, l = 0, i = 0, r = n - 1;
		while (i <= r && l < r) {
			if (nums[i] == 0) {
				nums[i] = nums[l];
				nums[l] = 0;
				l++;
				i++;
			} else if (nums[i] == 2) {
				nums[i] = nums[r];
				nums[r] = 2;
				r--;
			} else {
				i++;
			}
		}
	}
}
