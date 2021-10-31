package leetproblems;

public class Q434_NumberOfSegmentsInAString {
	public int countSegments(String s) {
		int n = s.length(), segments = 0;
		for (int i = 0; i < n; ++i) {
			if ((i == 0 || s.charAt(i - 1) == ' ') && s.charAt(i) != ' ')
				segments++;
		}
		return segments;
	}
}
