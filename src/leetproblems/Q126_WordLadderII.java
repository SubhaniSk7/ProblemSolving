package leetproblems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Q126_WordLadderII {
	List<List<String>> result = new ArrayList<>();
	HashSet<String> words = new HashSet<>();
	HashSet<String> visited = new HashSet<>();
	int distance = 0;

	public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {

		words.addAll(wordList);
		bfs(beginWord, endWord);
		return result;
	}

	public void bfs(String beginWord, String endWord) {
		Queue<List<String>> q = new LinkedList<>();
		List<String> path = new ArrayList<>();
		path.add(beginWord);
		q.offer(path);

		int ladder = 0;
		boolean found = false;
		while (!q.isEmpty()) {
			int n = q.size();
			ladder++;
			for (String w : visited)
				words.remove(w);
			visited.clear();
			for (int i = 0; i < n; ++i) {
				path = q.poll();
				String cur = path.get(path.size() - 1);

				for (int j = 0; j < cur.length(); ++j) {
					char[] ch = cur.toCharArray();
					for (int k = 0; k < 26; ++k) {
						char t = (char) ('a' + k);
						if (t == ch[j])
							continue;
						ch[j] = t;
						String newWord = String.valueOf(ch);
						if (words.contains(newWord)) {
							ArrayList<String> newPath = new ArrayList<>(path);
							newPath.add(newWord);
							visited.add(newWord);
							if (newWord.equals(endWord)) {
								result.add(newPath);
								found = true;
							} else
								q.offer(newPath);
						}
					}
				}
			}
			if (found)
				return;
		}
		if (!found)
			result = new ArrayList<>();
	}
}
