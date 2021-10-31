package leetproblems;

public class Q771_JewelsAndStones {
	public int numJewelsInStones(String jewels, String stones) {
		int ans = 0;
		for (char ch : stones.toCharArray()) {
			if (jewels.indexOf(ch) > -1)
				ans += 1;
		}
		return ans;
	}
}
