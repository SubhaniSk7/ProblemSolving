package leetproblems;

public class Q1898_MaximumNumberOfRemovableCharacters {
	public int maximumRemovals(String s, String p, int[] removable) {
		char[] ch = s.toCharArray();
		int start = 0, end = removable.length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			for (int k = start; k <= mid; ++k)
				ch[removable[k]] = '.';

			if (check(String.valueOf(ch), p)) {
				start = mid + 1;
			} else {
				end = mid - 1;
				for (int k = start; k <= mid; ++k)
					ch[removable[k]] = s.charAt(removable[k]);
			}
		}
		return start;
	}

	public boolean check(String s, String p) {
		int i = 0, j = 0;
		while (i < p.length() && j < s.length()) {
			if (p.charAt(i) == s.charAt(j)) {
				i++;
				j++;
			} else
				j++;
		}
		return i == p.length();
	}
}
