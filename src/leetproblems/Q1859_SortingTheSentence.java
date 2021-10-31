package leetproblems;

import java.util.StringTokenizer;

public class Q1859_SortingTheSentence {
	public String sortSentence(String s) {
		StringTokenizer st = new StringTokenizer(s);
		String[] result = new String[9];
		while (st.hasMoreTokens()) {
			String t = st.nextToken();
			int ind = (t.charAt(t.length() - 1) - '0') - 1;
			result[ind] = t.substring(0, t.length() - 1);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 9; ++i) {
			if (result[i] != null)
				sb.append(result[i] + " ");
		}
		sb.deleteCharAt(sb.length() - 1);
		return sb.toString();
	}
}
