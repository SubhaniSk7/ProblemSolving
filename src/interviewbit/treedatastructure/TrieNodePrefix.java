package interviewbit.treedatastructure;

public class TrieNodePrefix {
	int freq = 1;
	TrieNodePrefix[] children = new TrieNodePrefix[256];

	public TrieNodePrefix() {
		for (int i = 0; i < 26; ++i)
			children[i] = null;
	}
}
