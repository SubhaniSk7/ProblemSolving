package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Q14_LongestCommonPrefix {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] strs = new String[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			strs[i] = st.nextToken();
		System.out.println(sol(strs));
	}

	public static String sol(String[] strs) {
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
}
