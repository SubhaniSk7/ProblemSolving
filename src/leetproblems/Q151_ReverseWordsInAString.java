package leetproblems;

public class Q151_ReverseWordsInAString {
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		String[] t = s.trim().split(" ");
		for (int i = t.length - 1; i >= 0; --i) {
			if (t[i].length() != 0)
				sb.append(t[i] + " ");
		}
		String result = sb.toString().trim();
		return result;
	}
}
