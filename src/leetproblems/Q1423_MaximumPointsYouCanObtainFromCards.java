package leetproblems;

public class Q1423_MaximumPointsYouCanObtainFromCards {
	public int maxScore(int[] cardPoints, int k) {
		int n = cardPoints.length, total = 0, l = 0;
		for (int i = 0; i < n; ++i)
			total += cardPoints[i];
		int winSize = n - k;
		if (winSize == 0)
			return total;
		int sum = 0, result = 0;
		for (int r = 0; r < n; ++r) {
			sum += cardPoints[r];
			if (r - l + 1 == winSize) {
				result = Math.max(result, total - sum);
				sum -= cardPoints[l];
				l++;
			}
		}
		return result;
	}
}
