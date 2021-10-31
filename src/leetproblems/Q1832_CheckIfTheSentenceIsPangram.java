package leetproblems;

public class Q1832_CheckIfTheSentenceIsPangram {
	public boolean checkIfPangram(String sentence) {
		boolean[] freq = new boolean[26];
		int count = 0;
		for (char ch : sentence.toCharArray()) {
			if (!freq[ch - 'a']) {
				freq[ch - 'a'] = true;
				count++;
			}
		}
		return count == 26;
	}
}
