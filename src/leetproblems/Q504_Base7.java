package leetproblems;

public class Q504_Base7 {
	public String convertToBase7(int num) {
		if (num == 0)
			return "0";
		StringBuilder sb = new StringBuilder();
		boolean sign = false;
		if (num < 0) {
			sign = true;
			num = -num;
		}
		while (num > 0) {
			sb.append("" + num % 7);
			num /= 7;
		}
		if (sign)
			sb.append("-");
		return sb.reverse().toString();
	}
}
