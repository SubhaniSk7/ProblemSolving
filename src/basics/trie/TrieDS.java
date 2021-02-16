package basics.trie;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TrieDS {
	static class TrieNode {
		boolean isEnd = false;
		TrieNode[] children = new TrieNode[26];// Alphabets size = 26

		TrieNode() {
			isEnd = false;
			for (int i = 0; i < 26; ++i)
				children[i] = null;
		}
	}

	public static TrieNode root;

	public static void main(String subhani[]) throws IOException {
		root = new TrieNode();

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter no.of String:");
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[n];
		for (int i = 0; i < n; ++i)
			str[i] = br.readLine();
		for (int i = 0; i < n; ++i) {
			insert(str[i]);
			System.out.println();
		}

		int t = Integer.parseInt(br.readLine());
		for (int i = 0; i < t; ++i) {
			boolean found = search(br.readLine());
			if (found)
				System.out.println("present");
			else
				System.out.println("Not present");
			System.out.println();
		}
	}

	public static void insert(String key) {
		int length = key.length(), index;
		TrieNode current = root;
		for (int i = 0; i < length; ++i) {
			index = key.charAt(i) - 'a';
			if (current.children[index] == null)
				current.children[index] = new TrieNode();
			current = current.children[index];
		}
		current.isEnd = true;
	}

	public static boolean search(String pattern) {
		TrieNode current = root;
		int length = pattern.length(), index;
		for (int i = 0; i < length; ++i) {
			index = pattern.charAt(i) - 'a';
			if (current.children[index] == null)
				return false;
			current = current.children[index];
		}
		return (current != null) && current.isEnd;
	}

	public static void printTrie() {
		TrieNode current = root;

	}
}
