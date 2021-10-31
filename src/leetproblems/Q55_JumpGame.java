package leetproblems;

public class Q55_JumpGame {

//	public boolean canJump(int[] nums) {
//		int n = nums.length, goal = n - 1;
//		for (int i = n - 1; i >= 0; --i) {
//			if (i + nums[i] >= goal)
//				goal = i;
//		}
//		return goal == 0;
//	}

	public boolean canJump(int[] nums) {
		int n = nums.length, can_reach = 0;
		for (int i = 0; i <= can_reach; ++i) {
			if (i == n - 1)
				return true;
			can_reach = Math.max(can_reach, i + nums[i]);
		}
		return false;
	}

}
