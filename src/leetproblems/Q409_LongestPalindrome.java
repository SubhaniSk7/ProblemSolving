package leetproblems;

import java.util.HashMap;

public class Q409_LongestPalindrome {
	public static void main(String[] subhani) {
		System.out.println(new Q409_LongestPalindrome().longestPalindrome("abccccdd"));
	}

	public int longestPalindrome(String s) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (char ch : s.toCharArray())
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		int len = 0;
		boolean first = true;
		for (char k : map.keySet()) {
			int val = map.get(k);
			if (val % 2 == 0)
				len += val;
			if (val % 2 != 0) {
				if (first) {
					first = false;
					len += val;
				} else
					len += val - 1;
			}
		}
		// int result = 0;
		// for(char k: map.keySet()){
		// int val = map.get(k);
		// result += val/2 * 2;
		// if(result%2 == 0 && val%2==1)
		// result+=1;
		// }
		// return result;

		return len;
	}
}
