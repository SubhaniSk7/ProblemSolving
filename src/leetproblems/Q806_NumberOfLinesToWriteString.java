package leetproblems;

public class Q806_NumberOfLinesToWriteString {
	public int[] numberOfLines(int[] widths, String s) {
		int lines = 1, width = 0;
		for (char ch : s.toCharArray()) {
			int w = widths[ch - 'a'];
			if (width + w > 100) {
				lines++;
				width = 0;
			}
			width += w;
		}
		return new int[] { lines, width };
	}
}
