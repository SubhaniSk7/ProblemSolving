package basics.trie;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class SuggestionWithHighestWeight {
	static class TrieNode {
		int w;
		boolean isWord;
		TrieNode[] children;

		public TrieNode() {
			isWord = false;
			children = new TrieNode[26];
			for (int i = 0; i < 26; ++i)
				children[i] = null;
		}
	}

	static class Pair {
		String word;
		int weight;

		public Pair(String word, int weight) {
			this.word = word;
			this.weight = weight;
		}
	}

	public static TrieNode root = new TrieNode();

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), q = Integer.parseInt(st.nextToken());
		ArrayList<Pair> words = new ArrayList<Pair>();
		for (int i = 0; i < n; ++i) {
			st = new StringTokenizer(br.readLine());
			String s = st.nextToken();
			int w = Integer.parseInt(st.nextToken());
			words.add(new Pair(s, w));
		}
		Collections.sort(words, (a, b) -> a.weight - b.weight);
		for (Pair p : words) {
			System.out.println(p.word + " " + p.weight);
		}
		for (Pair p : words) {
			insert(p.word, p.weight);
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < q; ++i) {
			String query = br.readLine();
			int weight = getSuggestion(query);
			sb.append(weight + "\n");
		}

		System.out.println(sb.toString());
	}

	public static void insert(String s, int weight) {
		TrieNode cur = root;
		for (char ch : s.toCharArray()) {
			int index = ch - 'a';
			if (cur.children[index] == null)
				cur.children[index] = new TrieNode();
			cur = cur.children[index];
			cur.w = weight;
		}
		cur.isWord = true;
		cur.w = weight;
	}

	public static int getSuggestion(String query) {
		TrieNode cur = root;
		for (char ch : query.toCharArray()) {
			int index = ch - 'a';
			if (cur.children[index] == null)
				return -1;
			cur = cur.children[index];
		}
		// weight = dfs(cur, weight);
		// return weight;
		if (cur != null)
			return cur.w;
		return -1;
	}

// public static int dfs(TrieNode cur, int weight){
// if(cur == null)
// return weight;
// if(cur != null && cur.isWord)
// weight = Math.max(weight, cur.w);
// for(int i = 0; i < 26; ++i){
// weight = Math.max(weight, dfs(cur.children[i], weight));
// }
// return weight;
// }
}
