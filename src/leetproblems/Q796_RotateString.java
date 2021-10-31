package leetproblems;

public class Q796_RotateString {

	public boolean rotateString(String s, String goal) {
		if (s.length() == goal.length() && (s + s).contains(goal))
			return true;
		return false;
	}

//	public boolean rotateString(String s, String goal) {
//		StringBuilder sb = new StringBuilder(s);
//		System.out.println(sb);
//		for (int i = 0; i < s.length(); ++i) {
//			char ch = sb.charAt(0);
//			sb.deleteCharAt(0);
//			sb.append("" + ch);
//			String t = sb.toString();
//			if (t.equals(goal))
//				return true;
//		}
//		return false;
//	}
}
