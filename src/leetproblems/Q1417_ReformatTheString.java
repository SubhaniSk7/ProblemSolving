package leetproblems;

import java.util.ArrayList;

public class Q1417_ReformatTheString {
	public String reformat(String s) {
		ArrayList<Character> d = new ArrayList<>();
		ArrayList<Character> c = new ArrayList<>();
		for (char ch : s.toCharArray()) {
			if (Character.isDigit(ch))
				d.add(ch);
			else
				c.add(ch);
		}

		StringBuilder sb = new StringBuilder();
		if (Math.abs(d.size() - c.size()) > 1)
			return sb.toString();
		if (d.size() >= c.size()) {
			int j = 0, k = 0;
			for (int i = 0; i < s.length(); ++i) {
				if (i % 2 == 0) {
					sb.append(d.get(j++));
				} else
					sb.append(c.get(k++));
			}
		} else {
			int j = 0, k = 0;
			for (int i = 0; i < s.length(); ++i) {
				if (i % 2 == 0) {
					sb.append(c.get(j++));
				} else
					sb.append(d.get(k++));
			}
		}
		return sb.toString();
	}
}
