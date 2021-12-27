package leetproblems;

public class Q1323_Maximum69Number {
	public int maximum69Number(int num) {
		return Integer.parseInt(("" + num).replaceFirst("6", "9"));
	}
}
