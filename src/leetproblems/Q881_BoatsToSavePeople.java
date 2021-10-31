package leetproblems;

import java.util.Arrays;

public class Q881_BoatsToSavePeople {
	public int numRescueBoats(int[] people, int limit) {
		Arrays.sort(people);
		int l = 0, r = people.length - 1, boats = 0;
		while (l <= r) {
			if (people[l] + people[r] <= limit) {
				l++;
				r--;
			} else
				r--;
			boats++;
		}
		return boats;
	}
}
