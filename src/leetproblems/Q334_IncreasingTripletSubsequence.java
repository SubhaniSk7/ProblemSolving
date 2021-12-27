package leetproblems;

public class Q334_IncreasingTripletSubsequence {
	public boolean increasingTriplet(int[] nums) {
		int smallest = Integer.MAX_VALUE, big = Integer.MAX_VALUE;
		for (int x : nums) {
			if (x <= smallest)
				smallest = x;
			else if (x <= big)
				big = x;
			else
				return true;
		}
		return false;
	}
}
