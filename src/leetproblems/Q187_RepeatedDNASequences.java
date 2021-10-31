package leetproblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Q187_RepeatedDNASequences {
	public List<String> findRepeatedDnaSequences(String s) {
		HashMap<String, Integer> map = new HashMap<>();
		List<String> result = new ArrayList<>();
		int n = s.length();
		StringBuilder sb = new StringBuilder();
		for (int r = 0; r < n; ++r) {
			sb.append(s.charAt(r));
			if (sb.length() > 10)
				sb.deleteCharAt(0);
			if (sb.length() == 10) {
				String t = sb.toString();
				map.put(t, map.getOrDefault(t, 0) + 1);
				if (map.get(t) == 2)
					result.add(t);
			}
		}
		return result;
	}
}
