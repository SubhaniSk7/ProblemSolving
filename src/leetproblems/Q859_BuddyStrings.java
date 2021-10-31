package leetproblems;

import java.util.ArrayList;
import java.util.HashSet;

public class Q859_BuddyStrings {
	public boolean buddyStrings(String s, String goal) {
		int n = s.length(), m = goal.length();
		if (n != m)
			return false;

		if (s.equals(goal)) {
			HashSet<Character> set = new HashSet<>();
			for (char ch : s.toCharArray())
				set.add(ch);
			if (set.size() < n)
				return true;
			else
				return false;
		}

		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 0; i < n; ++i) {
			if (s.charAt(i) != goal.charAt(i)) {
				al.add(i);
			}
		}
		if (al.size() == 2 && s.charAt(al.get(0)) == goal.charAt(al.get(1))
				&& s.charAt(al.get(1)) == goal.charAt(al.get(0)))
			return true;
		return false;
	}
}
