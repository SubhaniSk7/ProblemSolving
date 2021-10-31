package leetproblems;

public class Q482_LicenseKeyFormatting {
//	public String licenseKeyFormatting(String s, int k) {
//		Stack<Character> stack = new Stack<>();
//		for (char ch : s.toCharArray()) {
//			if (ch == '-')
//				continue;
//			stack.push(ch);
//		}
//		if (stack.isEmpty())
//			return "";
//		StringBuilder sb = new StringBuilder();
//		int t = 0;
//		while (!stack.isEmpty()) {
//			if (t == k) {
//				sb.append("-");
//				t = 0;
//			}
//			sb.append("" + stack.pop());
//			t++;
//		}
//		sb.reverse();
//		if (sb.charAt(0) == '-')
//			sb.deleteCharAt(0);
//		return sb.toString().toUpperCase();
//	}

	public String licenseKeyFormatting(String s, int k) {
		s = s.replaceAll("-", "").toUpperCase();

		StringBuilder sb = new StringBuilder(s);
		for (int i = s.length() - k; i > 0; i = i - k)
			sb.insert(i, "-");
		return sb.toString();
	}
}
