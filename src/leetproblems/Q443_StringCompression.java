package leetproblems;

public class Q443_StringCompression {
	public int compress(char[] chars) {
		int n = chars.length, l = 0, r = 0, index = 0;
		while (l < n) {
			r = l;
			while (r < n && chars[l] == chars[r])
				r++;
			chars[index++] = chars[l];
			if (r - l > 1) {
				String len = "" + (r - l);
				for (char ch : len.toCharArray())
					chars[index++] = ch;
			}
			l = r;
		}
		return index;
	}
}
