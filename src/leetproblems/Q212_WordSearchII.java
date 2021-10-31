package leetproblems;

import java.util.ArrayList;
import java.util.List;

public class Q212_WordSearchII {
	List<String> result = new ArrayList<>();

	public List<String> findWords(char[][] board, String[] words) {
		TrieNode trie = new TrieNode();
		for (String s : words)
			add(trie, s);

		TrieNode cur = trie;

		int rows = board.length, cols = board[0].length;
		for (int i = 0; i < rows; ++i) {
			for (int j = 0; j < cols; ++j) {
				char ch = board[i][j];
				int index = ch - 'a';
				if (cur.children[index] != null) {
					rec(board, i, j, trie);
				}
			}
		}

		return result;
	}

	public void rec(char[][] board, int r, int c, TrieNode trie) {
		if (trie != null && trie.isEnd) {
			trie.isEnd = false;// removing that word (false)--> not adding duplicates
			result.add(trie.word);
		}
		if (r < 0 || r >= board.length || c < 0 || c >= board[0].length || board[r][c] == '.' || trie == null)
			return;

		char ch = board[r][c];
		int index = ch - 'a';
		trie = trie.children[index];

		board[r][c] = '.';
		rec(board, r + 1, c, trie);
		rec(board, r - 1, c, trie);
		rec(board, r, c + 1, trie);
		rec(board, r, c - 1, trie);
		board[r][c] = ch;
	}

	public void add(TrieNode trie, String word) {
		TrieNode cur = trie;
		for (char ch : word.toCharArray()) {
			int index = ch - 'a';
			if (cur.children[index] == null)
				cur.children[index] = new TrieNode();
			cur = cur.children[index];
		}
		cur.word = word;
		cur.isEnd = true;
	}

	public boolean search(TrieNode trie, String word) {
		TrieNode cur = trie;
		for (char ch : word.toCharArray()) {
			int index = ch - 'a';
			if (cur.children[index] == null)
				return false;
			cur = cur.children[index];
		}
		return cur != null && cur.isEnd;
	}

	private class TrieNode {
		String word;
		boolean isEnd;
		TrieNode[] children = new TrieNode[26];

		TrieNode() {
			word = null;
			isEnd = false;
			for (int i = 0; i < 26; ++i)
				children[i] = null;
		}
	}
}
