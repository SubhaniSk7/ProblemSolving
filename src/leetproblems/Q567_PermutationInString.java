package leetproblems;

public class Q567_PermutationInString {
	int[] freq = new int[26];

	public boolean checkInclusion(String s1, String s2) {
		for (char ch : s1.toCharArray())
			freq[ch - 'a']++;
		int len1 = s1.length(), len2 = s2.length(), l = 0;
		for (int r = 0; r < len2; ++r) {
			char c2 = s2.charAt(r);
			freq[c2 - 'a']--;
			if (r - l + 1 == len1) {
				if (good()) {
					return true;
				} else {
					char c1 = s2.charAt(l);
					freq[c1 - 'a']++;
					l++;
				}
			}
		}
		return false;
	}

	public boolean good() {
		for (int i = 0; i < 26; ++i) {
			if (freq[i] != 0)
				return false;
		}
		return true;
	}
}
