package leetproblems;

import java.util.List;

public class Q1239_MaximumLengthOfAConcatenatedStringWithUniqueCharacters {
	int result = 0;

	public int maxLength(List<String> arr) {
		backtrack(arr, 0, "");
		return result;
	}

	public void backtrack(List<String> arr, int index, String s) {

		if (index == arr.size() && countFreq(s) > result) {
			result = s.length();
			return;
		}
		if (index == arr.size())
			return;

		backtrack(arr, index + 1, s);
		backtrack(arr, index + 1, s + arr.get(index));
	}

	public int countFreq(String s) {
		int[] freq = new int[26];
		for (char ch : s.toCharArray()) {
			freq[ch - 'a']++;
			if (freq[ch - 'a'] > 1)
				return -1;
		}
		return s.length();
	}
}
