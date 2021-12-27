package leetproblems;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class Q139_WordBreak {

	HashSet<String> set = new HashSet<>();
	HashMap<String, Boolean> map = new HashMap<>();

	public boolean wordBreak_2(String s, List<String> wordDict) {
		for (String w : wordDict)
			set.add(w);
		return present(s);
	}

	public boolean present(String word) {
		if (word.length() == 0)
			return true;
		boolean found = false;
		for (int i = 0; i < word.length(); ++i) {
			String t = word.substring(0, i + 1);
			if (set.contains(t)) {
				String x = word.substring(i + 1);
				if (map.containsKey(x))
					found = map.get(x);
				else
					found = present(x);

				if (found)
					return found;
				else
					map.put(x, false);
			}
		}
		return found;
	}

//	-------------------------------------------------------------------------------
	public boolean wordBreak(String s, List<String> wordDict) {
		int n = s.length();
		boolean[] dp = new boolean[n + 1];

		dp[0] = true;
		for (int i = 1; i <= n; ++i) {
			for (String x : wordDict) {
				if (x.length() <= i) {
					if (dp[i - x.length()] && s.substring(i - x.length(), i).equals(x)) {
						dp[i] = true;
						break;
					}
				}
			}
		}
		return dp[n];
	}

//  -------------------------------------Trie DS------------------------------------------
	private class TrieNode {
		boolean isEnd;
		TrieNode[] children = new TrieNode[26];

		TrieNode() {
			isEnd = false;
			for (int i = 0; i < 26; ++i)
				children[i] = null;
		}
	}

	public void addWord(TrieNode trie, String w) {
		TrieNode cur = trie;
		for (char ch : w.toCharArray()) {
			int index = ch - 'a';
			if (cur.children[index] == null)
				cur.children[index] = new TrieNode();
			cur = cur.children[index];
		}
		cur.isEnd = true;
	}

	public boolean wordBreak_1(String s, List<String> wordDict) {
		TrieNode trie = new TrieNode(), cur;
		for (String w : wordDict)
			addWord(trie, w);

		int n = s.length();
		boolean[] dp = new boolean[n + 1];
		dp[n] = true;
		for (int i = n - 1; i >= 0; --i) {
			cur = trie;
			for (int j = i; cur != null && j < n; ++j) {
				int index = s.charAt(j) - 'a';
				cur = cur.children[index];
				if (cur != null && cur.isEnd && dp[j + 1]) {
					dp[i] = true;
					break;
				}
			}
		}
		return dp[0];
	}

//	-------------------------------------------------------------------
//	public boolean wordBreak(String s, List<String> wordDict) {
//		HashMap<String, Boolean> map = new HashMap<>();
//		for (String t : wordDict)
//			map.put(t, true);
//		int n = s.length();
//		boolean[][] dp = new boolean[n][n];
//		for (int i = 0; i < n; ++i)
//			Arrays.fill(dp[i], false);
//		for (int i = 0; i < n; ++i) {
//			String t = "" + s.charAt(i);
//			if (map.getOrDefault(t, false))
//				dp[i][i] = true;
//		}
//
//		for (int len = 2; len <= n; ++len) {
//			for (int i = 0; i < n - len + 1; ++i) {
//				int j = i + len - 1;
//				String t = s.substring(i, j + 1);
//				if (map.getOrDefault(t, false))
//					dp[i][j] = true;
//				else {
//					for (int k = i; k < j; ++k) {
//						if (dp[i][k] && dp[k + 1][j]) {
//							dp[i][j] = true;
//							break;
//						}
//					}
//				}
//			}
//		}
//		return dp[0][n - 1];
//	}
}
