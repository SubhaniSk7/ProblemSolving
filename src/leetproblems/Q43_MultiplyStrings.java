package leetproblems;

public class Q43_MultiplyStrings {
	public String multiply(String num1, String num2) {
		int m = num1.length(), n = num2.length();
		int[] product = new int[m + n];
		for (int i = num1.length() - 1; i >= 0; --i) {
			for (int j = num2.length() - 1; j >= 0; --j) {
				int mul = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
				product[i + j + 1] += mul;
			}
		}
		System.out.print((char) ('a' + 1));
		int carry = 0;
		for (int i = product.length - 1; i >= 0; --i) {
			int d = (product[i] + carry) % 10;
			carry = (product[i] + carry) / 10;
			product[i] = d;
		}
		StringBuilder sb = new StringBuilder();
		for (int t : product)
			sb.append(t);
		while (sb.length() != 0 && sb.charAt(0) == '0')
			sb.deleteCharAt(0);
		return sb.length() == 0 ? "0" : sb.toString();
	}
}
