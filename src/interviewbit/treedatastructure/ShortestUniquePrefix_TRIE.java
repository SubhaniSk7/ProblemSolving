package interviewbit.treedatastructure;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ShortestUniquePrefix_TRIE {

	public TrieNodePrefix insert(String key, TrieNodePrefix root) {
		int n = key.length();
		TrieNodePrefix cur = root;
		for (int level = 0; level < n; ++level) {
			int index = key.charAt(level) - 'a';
			if (cur.children[index] == null)
				cur.children[index] = new TrieNodePrefix();
			else
				cur.children[index].freq++;
			cur = cur.children[index];
		}
		return root;
	}

	public String search(String key, TrieNodePrefix root) {
		String s = "";
		int n = key.length();
		TrieNodePrefix cur = root;
		for (int level = 0; level < n; ++level) {
			s = s + key.charAt(level);
			int index = key.charAt(level) - 'a';
			if (cur.children[index].freq == 1)
				return s;
			cur = cur.children[index];
		}
		return s;
	}

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		ArrayList<String> A = new ArrayList<>();
		while (st.hasMoreTokens())
			A.add(st.nextToken());

		ShortestUniquePrefix_TRIE sol = new ShortestUniquePrefix_TRIE();
		System.out.println(sol.prefix(A));
	}

	public ArrayList<String> prefix(ArrayList<String> A) {
		TrieNodePrefix root = new TrieNodePrefix();
		int n = A.size();
		for (int i = 0; i < n; ++i)
			insert(A.get(i), root);
		ArrayList<String> result = new ArrayList<>();
		for (int i = 0; i < A.size(); ++i)
			result.add(search(A.get(i), root));
		return result;
	}
}
