package leetproblems;

public class Q137_SingleNumberII {
//	public int singleNumber(int[] nums) {
//		HashMap<Integer, Integer> map = new HashMap<>();
//		for (int x : nums)
//			map.put(x, map.getOrDefault(x, 0) + 1);
//		for (int x : map.keySet())
//			if (map.get(x) == 1)
//				return x;
//		return -1;
//	}

	public int singleNumber(int[] nums) {
		int ones = 0, twos = 0;
		for (int x : nums) {
			ones = (ones ^ x) & (~twos);
			twos = (twos ^ x) & (~ones);
		}
		return ones;
	}
}
