package leetproblems;

import java.util.HashMap;

public class Q2002_MaximumProductOfTheLengthOfTwoPalindromicSubsequences {
	HashMap<Integer, Integer> map = new HashMap<>();

	public int maxProduct(String s) {
		int n = s.length(), result = 0;
		char[] ch = s.toCharArray();
		int totalMasks = (1 << n) - 1;
		for (int m = 1; m <= totalMasks; ++m)
			map.put(m, palindrome(ch, m));

		System.out.println(map.toString());

		for (int m1 = totalMasks; m1 > 0; --m1) {
			if (map.get(m1) * (n - map.get(m1)) > result) {
				for (int m2 = totalMasks ^ m1; m2 > 0; m2 = (m2 - 1) & (totalMasks ^ m1)) {
					result = Math.max(result, map.get(m1) * map.get(m2));
				}
			}
		}
		return result;
	}

	public int palindrome(char[] ch, int mask) {
		int len = 0, l = 0, r = ch.length - 1;
		while (l <= r) {
			if ((mask & (1 << l)) == 0)
				l++;
			else if ((mask & (1 << r)) == 0)
				r--;
			else if (ch[l] != ch[r])
				return 0;
			else {
				len += 1 + (l != r ? 1 : 0);
				l++;
				r--;
			}
		}
		return len;
	}
}
