package basics.interview;

public class ShiftString {

	public static void main(String[] subhani) {
		System.out.println(solve("abcd", 15, 30));
	}

	public static String solve(String s, int l, int r) {
		int n = s.length();
		l %= n;
		r %= n;
		int d = Math.abs(l - r);
		if (l == r) {
			return s;
		} else if (l > r) {
			String t = s.substring(d) + s.substring(0, d);
			return t;
		} else {
			String t = s.substring(n - d) + s.substring(0, n - d);
			return t;
		}
	}
}
