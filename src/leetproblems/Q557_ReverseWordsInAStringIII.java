package leetproblems;

public class Q557_ReverseWordsInAStringIII {
	public String reverseWords(String s) {
		int l = 0, r = 0;
		char[] ch = s.toCharArray();
		for (r = 0; r < ch.length; ++r) {
			if (ch[r] == ' ') {
				reverse(ch, l, r - 1);
				l = r + 1;
			}
		}
		reverse(ch, l, r - 1);
		return String.valueOf(ch);
	}

	public void reverse(char[] ch, int i, int j) {
		while (i <= j) {
			char t = ch[i];
			ch[i] = ch[j];
			ch[j] = t;
			i++;
			j--;
		}
	}
}
