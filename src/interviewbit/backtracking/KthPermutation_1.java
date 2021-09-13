package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class KthPermutation_1 {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		System.out.println(getPermutation(n, k));
	}

	public static int newK;

	public static String getPermutation(int n, int k) {
		String ans = "";
		ArrayList<Integer> al = new ArrayList<>();
		for (int i = 1; i <= n; ++i)
			al.add(i);
		int itr = al.get(0);
		k = k - 1;
		newK = k;
		for (int i = 0; i < n; ++i) {
			int index = getIndex(newK, n - i);
//			System.out.println(index);
			if (index < al.size()) {
				ans += (al.get(index).toString());
				al.remove(index);
			} else
				ans += String.valueOf(itr + 2);
			if (al.size() > 0)
				itr = al.get(0);
		}
		return ans;
	}

	public static int getIndex(int k, int n) {
		int index = 0;
		if (n == 1)
			return index;
		n--;
		int nParticalFact = n;
		while (k >= nParticalFact && n > 1) {
			nParticalFact = nParticalFact * (n - 1);
			n--;
		}
		index = k / nParticalFact;
		newK = k % nParticalFact;
		return index;
	}

}
