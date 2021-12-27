package leetproblems;

public class Q171_ExcelSheetColumnNumber {
	public int titleToNumber(String columnTitle) {
		int num = 0, p = 0;
		for (int i = columnTitle.length() - 1; i >= 0; --i) {
			num += Math.pow(26, p) * (columnTitle.charAt(i) - 'A' + 1);
			++p;
		}
		return num;
	}
}
