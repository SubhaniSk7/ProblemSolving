package leetproblems;

public class Q942_DIStringMatch {
	public int[] diStringMatch(String s) {
		int n = s.length(), l = 0, r = n, i = 0;
		int[] result = new int[n + 1];
		for (char ch : s.toCharArray())
			result[i++] = (ch == 'I' ? l++ : r--);
		result[i] = l;
		return result;
	}
}
