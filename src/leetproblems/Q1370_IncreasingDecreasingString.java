package leetproblems;

public class Q1370_IncreasingDecreasingString {
	public String sortString(String s) {
		int[] freq = new int[26];
		int len = 0;
		for (char ch : s.toCharArray()) {
			freq[ch - 'a']++;
			len++;
		}
		int count = 0;
		boolean small = true;
		StringBuilder sb = new StringBuilder();
		while (len > 0) {
			count = 0;
			if (small) {
				for (int i = 0; i < 26; ++i) {
					if (freq[i] != 0) {
						sb.append((char) ('a' + i));
						freq[i]--;
						count++;
					}
				}
				small = false;
			} else {
				for (int i = 25; i >= 0; --i) {
					if (freq[i] != 0) {
						sb.append((char) ('a' + i));
						freq[i]--;
						count++;
					}
				}
				small = true;
			}
			len -= count;
		}
		return sb.toString();
	}
}
