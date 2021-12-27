package leetproblems;

import java.util.HashMap;

public class Q914_XOfAKindInADeckOfCards {
	public boolean hasGroupsSizeX(int[] deck) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int x : deck)
			map.put(x, map.getOrDefault(x, 0) + 1);
		int x = 0;
		for (int i : map.values())
			x = gcd(x, i);
		return x > 1;
	}

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}
}
