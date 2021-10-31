package leetproblems;

public class Q917_ReverseOnlyLetters {
	public static void main(String[] subhani) {
		Q917_ReverseOnlyLetters obj = new Q917_ReverseOnlyLetters();

		System.out.println(obj.reverseOnlyLetters("a-bC-dEf-ghIj"));
	}

	public String reverseOnlyLetters(String s) {
		int n = s.length();
		int l = 0, r = n - 1;
		char[] ch = s.toCharArray();
		while (l < r) {
			boolean a = Character.isAlphabetic(ch[l]);
			boolean b = Character.isAlphabetic(ch[r]);
			if (!a) {
				l++;
				continue;
			}
			if (!b) {
				r--;
				continue;
			}
			char temp = ch[l];
			ch[l] = ch[r];
			ch[r] = temp;
			l++;
			r--;
		}
		return String.valueOf(ch);
	}
}
