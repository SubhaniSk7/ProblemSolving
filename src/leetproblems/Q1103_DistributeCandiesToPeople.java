package leetproblems;

public class Q1103_DistributeCandiesToPeople {
//	public int[] distributeCandies(int candies, int num_people) {
//		int i = 0, cur = 1;
//		int[] people = new int[num_people];
//		while (candies > 0) {
//			if (i == num_people)
//				i = 0;
//			if (cur > candies) {
//				people[i++] += candies;
//				candies = 0;
//			} else {
//				people[i++] += cur;
//				candies -= cur;
//			}
//			cur += 1;
//		}
//		return people;
//	}

	public int[] distributeCandies(int candies, int num_people) {
		int[] people = new int[num_people];
		for (int i = 0; candies > 0; ++i) {
			people[i % num_people] += Math.min(candies, i + 1);
			candies -= i + 1;
		}
		return people;
	}
}
