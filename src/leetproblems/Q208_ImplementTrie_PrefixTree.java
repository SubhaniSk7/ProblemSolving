package leetproblems;

public class Q208_ImplementTrie_PrefixTree {
	TrieNode root;

	public Q208_ImplementTrie_PrefixTree() {
		root = new TrieNode();
	}

	public void insert(String word) {
		TrieNode cur = root;
		for (char ch : word.toCharArray()) {
			int index = ch - 'a';
			if (cur.children[index] == null)
				cur.children[index] = new TrieNode();
			cur = cur.children[index];
		}
		cur.isEnd = true;
	}

	public boolean search(String word) {
		TrieNode cur = root;
		for (char ch : word.toCharArray()) {
			int index = ch - 'a';
			if (cur.children[index] == null)
				return false;
			cur = cur.children[index];
		}
		return (cur != null) && cur.isEnd;
	}

	public boolean startsWith(String prefix) {
		TrieNode cur = root;
		for (char ch : prefix.toCharArray()) {
			int index = ch - 'a';
			if (cur.children[index] == null)
				return false;
			cur = cur.children[index];
		}
		return true;
	}
}

class TrieNode {
	boolean isEnd;
	TrieNode[] children = new TrieNode[26];// Alphabets size = 26

	TrieNode() {
		isEnd = false;
		for (int i = 0; i < 26; ++i)
			children[i] = null;
	}
}