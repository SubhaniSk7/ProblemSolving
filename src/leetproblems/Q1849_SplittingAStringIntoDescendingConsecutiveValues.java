package leetproblems;

public class Q1849_SplittingAStringIntoDescendingConsecutiveValues {
	public boolean splitString(String s) {
		return dfs(s, null);
	}

	public boolean dfs(String s, Long prev) {
		for (int i = 0; i < s.length(); ++i) {
			long cur = Long.parseLong(s.substring(0, i + 1));
			if (cur >= 10000000000L)
				return false;
			if (prev == null) {
				if (dfs(s.substring(i + 1), cur))
					return true;
			} else if (prev == cur + 1 && (i == s.length() - 1 || dfs(s.substring(i + 1), cur)))
				return true;
		}
		return false;
	}

//	public boolean splitString(String s) {
//		for (int i = 0; i < s.length() - 1; ++i) {
//			long num = Long.parseLong(s.substring(0, i + 1));
//			if (num >= 10000000000L)
//				return false;
//			if (dfs(s, i + 1, num))
//				return true;
//		}
//		return false;
//	}
//
//	public boolean dfs(String s, int index, long prev) {
//		if (index == s.length())
//			return true;
//		for (int i = index; i < s.length(); ++i) {
//			long num = Long.parseLong(s.substring(index, i + 1));
//			if (num >= 10000000000L)
//				return false;
//			if (num + 1 == prev && dfs(s, i + 1, num))
//				return true;
//		}
//		return false;
//	}

}
