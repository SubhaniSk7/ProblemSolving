package leetproblems;

public class Q242_ValidAnagram {
	public boolean isAnagram(String s, String t) {
		int[] sFreq = new int[26];
		for (char ch : s.toCharArray())
			sFreq[ch - 'a']++;
		for (char ch : t.toCharArray())
			sFreq[ch - 'a']--;
		for (int i = 0; i < 26; ++i)
			if (sFreq[i] != 0)
				return false;
		return true;
	}
}
