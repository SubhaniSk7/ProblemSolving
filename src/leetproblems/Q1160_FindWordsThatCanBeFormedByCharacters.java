package leetproblems;

public class Q1160_FindWordsThatCanBeFormedByCharacters {
	public int countCharacters(String[] words, String chars) {
		int result = 0;
		int[] freq = getFreq(chars);
		for (String s : words) {
			int[] temp = getFreq(s);
			boolean valid = true;
			for (int k = 0; k < 26; ++k) {
				if (freq[k] < temp[k]) {
					valid = false;
					break;
				}
			}
			if (valid)
				result += s.length();
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
