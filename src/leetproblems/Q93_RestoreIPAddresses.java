package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q93_RestoreIPAddresses {
	List<String> result = new ArrayList<>();

	public List<String> restoreIpAddresses(String s) {
		rec(s, 0, "", 0);
		return result;
	}

	public void rec(String s, int index, String t, int dots) {
		if (dots > 4)
			return;
		if (dots == 4 && index == s.length()) {
			result.add(t);
			return;
		}

		for (int i = 1; i < 4; ++i) {
			if (index + i > s.length())
				break;
			String x = s.substring(index, index + i);
			if (Integer.parseInt(x) >= 256 || (x.startsWith("0") && x.length() > 1))
				continue;
			String ip = t + x + (dots == 3 ? "" : ".");
			rec(s, index + i, ip, dots + 1);
		}
	}
}
