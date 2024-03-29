package leetproblems;

public class Q461_HammingDistance {
	public int hammingDistance(int x, int y) {
		int diff = 0;
		for (int i = 0; i < 32; ++i) {
			if ((x & (1 << i)) != (y & (1 << i)))
				diff++;
		}
		return diff;
	}
}
