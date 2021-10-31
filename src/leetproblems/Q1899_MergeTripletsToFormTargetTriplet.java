package leetproblems;

public class Q1899_MergeTripletsToFormTargetTriplet {
	public boolean mergeTriplets(int[][] triplets, int[] target) {
		int one = 0, two = 0, three = 0;
		for (int i = 0; i < triplets.length; ++i) {
			if (triplets[i][0] > target[0] || triplets[i][1] > target[1] || triplets[i][2] > target[2])
				continue;
			one = Math.max(one, triplets[i][0]);
			two = Math.max(two, triplets[i][1]);
			three = Math.max(three, triplets[i][2]);
		}
		return one == target[0] && two == target[1] && three == target[2];
	}

//	public boolean mergeTriplets_1(int[][] triplets, int[] target) {
//		boolean one = false, two = false, three = false;
//		for (int i = 0; i < triplets.length; ++i) {
//			if (triplets[i][0] == target[0] && triplets[i][1] <= target[1] && triplets[i][2] <= target[2])
//				one = true;
//			if (triplets[i][0] <= target[0] && triplets[i][1] == target[1] && triplets[i][2] <= target[2])
//				two = true;
//			if (triplets[i][0] <= target[0] && triplets[i][1] <= target[1] && triplets[i][2] == target[2])
//				three = true;
//		}
//		return one && two && three;
//	}
}
