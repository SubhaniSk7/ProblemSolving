package leetproblems;

import java.util.Random;

public class Q384_ShuffleAnArray {
	int[] nums;
	Random rand;

	public Q384_ShuffleAnArray(int[] nums) {
		this.nums = nums;
		rand = new Random();
	}

	public int[] reset() {
		return nums;
	}

	public int[] shuffle() {
		if (nums == null)
			return null;
		int[] temp = nums.clone();
		for (int i = 1; i < nums.length; ++i) {
			int index = rand.nextInt(i + 1);
			int t = temp[index];
			temp[index] = temp[i];
			temp[i] = t;
		}
		return temp;
	}
}
//Q384_ShuffleAnArray obj = new Q384_ShuffleAnArray(nums);
//int[] param_1 = obj.reset();
//int[] param_2 = obj.shuffle();
