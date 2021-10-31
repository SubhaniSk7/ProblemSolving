package leetproblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q916_WordSubsets {
	public List<String> wordSubsets(String[] words1, String[] words2) {
		int m = words2.length;
		int[] freq2 = new int[26];
		Arrays.fill(freq2, Integer.MIN_VALUE);
		for (int i = 0; i < m; ++i) {
			int[] temp = getFreq(words2[i]);
			for (int k = 0; k < 26; ++k)
				freq2[k] = Math.max(freq2[k], temp[k]);
		}
		ArrayList<String> result = new ArrayList<>();
		int n = words1.length;
		for (int i = 0; i < n; ++i) {
			String s = words1[i];
			int[] freq1 = getFreq(s);
			boolean valid = true;
			for (int k = 0; k < 26; ++k) {
				if (freq1[k] < freq2[k]) {
					valid = false;
					break;
				}
			}
			if (valid)
				result.add(s);
		}
		return result;
	}

	public int[] getFreq(String s) {
		int[] freq = new int[26];
		for (char ch : s.toCharArray())
			freq[ch - 'a']++;
		return freq;
	}
}
