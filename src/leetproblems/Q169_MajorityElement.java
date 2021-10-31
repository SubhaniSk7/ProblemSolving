package leetproblems;

import java.util.Arrays;

public class Q169_MajorityElement {
	public int majorityElement(int[] nums) {
		// int n = nums.length, ele = nums[0];
		// HashMap<Integer, Integer> map = new HashMap<>();
		// for(int x: nums){
		// map.put(x, map.getOrDefault(x, 0)+1);
		// if(map.get(x) >n/2){
		// return x;
		// }
		// }
		// return ele;

		Arrays.sort(nums);
		return nums[nums.length / 2];
	}
}
