package leetproblems;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q127_WordLadder {
	HashSet<String> words = new HashSet<>();
	HashSet<String> set = new HashSet<>();

	public int ladderLength(String beginWord, String endWord, List<String> wordList) {
		words.addAll(wordList);
		return bfs(beginWord, endWord);
	}

	public int bfs(String beginWord, String endWord) {
		Queue<String> q = new LinkedList<>();
		q.offer(beginWord);
		int ladder = 0;
		while (!q.isEmpty()) {
			int n = q.size();
			ladder++;
			for (int i = 0; i < n; ++i) {
				String cur = q.poll();
				if (cur.equals(endWord))
					return ladder;
				for (int j = 0; j < cur.length(); ++j) {
					char[] ch = cur.toCharArray();

					for (int k = 0; k < 26; ++k) {
						char t = (char) ('a' + k);
						if (t == ch[j])
							continue;
						ch[j] = t;
						String newWord = String.valueOf(ch);
						if (words.contains(newWord) && set.add(newWord)) {
							q.offer(newWord);
						}
					}
				}
			}
		}
		return 0;
	}
}
