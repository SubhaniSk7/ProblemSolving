package leetproblems;

public class Q211_DesignAddAndSearchWordsDataStructure {

	TrieNode root;

	public Q211_DesignAddAndSearchWordsDataStructure() {
		root = new TrieNode();
	}

	public void addWord(String word) {
		int n = word.length();
		TrieNode cur = root;
		for (int i = 0; i < n; ++i) {
			int index = word.charAt(i) - 'a';
			if (cur.children[index] == null)
				cur.children[index] = new TrieNode();
			cur = cur.children[index];
		}
		cur.isWord = true;
	}

	public boolean search(String word) {
		return dfs(word, root);
	}

	public boolean dfs(String word, TrieNode cur) {
		for (int i = 0; i < word.length(); ++i) {
			char ch = word.charAt(i);
			if (ch == '.') {
				for (int k = 0; k < 26; ++k) {
					if (cur.children[k] != null && dfs(word.substring(i + 1), cur.children[k]))
						return true;
				}
				return false;
			} else {
				int index = ch - 'a';
				if (cur.children[index] == null)
					return false;
				cur = cur.children[index];
			}
		}
		return cur != null && cur.isWord;
	}

	class TrieNode {
		TrieNode[] children = new TrieNode[26];
		boolean isWord;

		TrieNode() {
			for (int i = 0; i < 26; ++i)
				children[i] = null;
			isWord = false;
		}
	}
}
