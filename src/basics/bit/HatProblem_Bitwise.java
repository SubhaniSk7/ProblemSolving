package basics.bit;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

// total hats = m,persons =n, each person has collections of hats
// allot each person such that no two persons wear same hat.
public class HatProblem_Bitwise {
	public static int[][] dp;// i = person(mask)--> 2^n possibilities, j = hat => person wearing
								// j-th hat.if that person has that j-th hat in his collection then
								// wear/not ->check ways

	public static ArrayList<Integer>[] hatCollections = new ArrayList[101];
	public static int allMask, MOD = 1000000007, powerSet;

	public static void main(String[] subhani) throws IOException, InterruptedException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		powerSet = (1 << n) + 1;
		for (int i = 0; i < hatCollections.length; ++i)
			hatCollections[i] = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			while (st.hasMoreElements())
				hatCollections[Integer.parseInt(st.nextToken())].add(i);
		}
		sol(n);
	}

	public static void sol(int n) throws InterruptedException {
		allMask = (1 << n) - 1;// set all bits i.e., all persons wearing hat
		dp = new int[powerSet][101];
		for (int i = 0; i < powerSet; i++)
			for (int j = 0; j < 101; ++j)
				dp[i][j] = -1;
		System.out.println(countWays(0, 1));
		print();
	}

	public static int countWays(int mask, int cap) {
		if (mask == allMask)
			return 1;
		if (cap > 100)
			return 0;
		if (dp[mask][cap] != -1)
			return dp[mask][cap];
		long ways = countWays(mask, cap + 1);
		int size = hatCollections[cap].size();
		for (int j = 0; j < size; ++j) {
			int person = hatCollections[cap].get(j);
			if ((mask & (1 << person)) != 0)
				continue;
			else
				ways += countWays(mask | (1 << person), cap + 1);
//			ways %= MOD;
		}
		return dp[mask][cap] = (int) ways;
	}

	public static void print() throws InterruptedException {
		for (int i = 0; i < powerSet; ++i) {
			for (int j = 0; j < 101; ++j)
				System.out.print(dp[i][j] + " ");
			System.out.println();
		}
	}
}
