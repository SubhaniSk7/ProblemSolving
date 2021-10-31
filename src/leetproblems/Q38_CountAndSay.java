package leetproblems;

public class Q38_CountAndSay {
	public String countAndSay(int n) {
		String result = "1";
		for (int i = 2; i <= n; ++i) {
			result = say(result);
		}
		return result;
	}

	public String say(String s) {
		int count = 1, i = 1;
		StringBuilder sb = new StringBuilder();
		char prev = s.charAt(0);
		for (; i < s.length(); ++i) {
			if (s.charAt(i) == prev) {
				count++;
			} else {
				sb.append(count);
				sb.append(prev);
				prev = s.charAt(i);
				count = 1;
			}
		}
		sb.append(count);
		sb.append(prev);
		return sb.toString();
	}
}
