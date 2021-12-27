package leetproblems;

public class Q1071_GreatestCommonDivisorOfStrings {
//	public String gcdOfStrings(String str1, String str2) {
//		int a = str1.length(), b = str2.length();
//		int val = gcd(a, b);
//		if (val == a && val == b) {
//			if (str1.equals(str2))
//				return str1;
//			else
//				return "";
//		}
//		StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
//		while (sb1.length() < a)
//			sb1.append(str1.substring(0, val));
//		while (sb2.length() < b)
//			sb2.append(str1.substring(0, val));
//		if (sb1.toString().equals(str1) && sb2.toString().equals(str2))
//			return str1.substring(0, val);
//		else
//			return "";
//	}

	public int gcd(int a, int b) {
		if (b == 0)
			return a;
		return gcd(b, a % b);
	}

	public String gcdOfStrings(String str1, String str2) {
		return ((str1 + str2).equals(str2 + str1)) ? str1.substring(0, gcd(str1.length(), str2.length())) : "";
	}

	public static void main(String[] subhani) {
		System.out.println(new Q1071_GreatestCommonDivisorOfStrings().gcd(40, 30));
	}
}
