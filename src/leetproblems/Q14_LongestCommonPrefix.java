package leetproblems;

public class Q14_LongestCommonPrefix {

	public String sol(String[] strs) {
		int n = strs.length;
		String ans = "";
		if (n == 0)
			return ans;
		else if (n == 1)
			return strs[0];
		for (int i = 0; i < strs[0].length(); ++i) {
			for (int j = 1; j < n; ++j)
				if (i >= strs[j].length() || strs[0].charAt(i) != strs[j].charAt(i))
					return ans;
			ans += strs[0].charAt(i);
		}
		return ans;
	}

	public String sol_1(String[] strs) {
		int n = strs.length;
		String prefix = strs[0];
		for (int i = 1; i < n; ++i) {
			while (strs[i].indexOf(prefix) != 0)
				prefix = prefix.substring(0, prefix.length() - 1);
		}
		return prefix;
	}
}
