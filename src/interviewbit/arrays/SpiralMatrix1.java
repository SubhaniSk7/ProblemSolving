package interviewbit.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class SpiralMatrix1 {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(st.nextToken()), n = Integer.parseInt(st.nextToken());
		int[][] nums = new int[m][n];
		List<ArrayList<Integer>> A = new ArrayList<ArrayList<Integer>>();
		for (int i = 0; i < m; ++i) {
			ArrayList<Integer> subList = new ArrayList<Integer>();
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < n; ++j)
				subList.add(Integer.parseInt(st.nextToken()));
			A.add(subList);
		}
		spiralOrder(A);
	}

	public static ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
		int t = 0, b = A.size() - 1, l = 0, r = A.get(0).size() - 1;
		ArrayList<Integer> result = new ArrayList<Integer>();
		int dir = 0;
		System.out.println(t + " " + b + " " + l + " " + r);
		while (t <= b && l <= r) {
			if (dir == 0) {// l to r
				for (int i = l; i <= r; ++i)
					result.add(A.get(t).get(i));
				dir = 1;
				t++;
			} else if (dir == 1) {// t to b
				for (int i = t; i <= b; ++i)
					result.add(A.get(i).get(r));
				dir = 2;
				r--;
			} else if (dir == 2) {// r to l
				for (int i = r; i >= l; --i)
					result.add(A.get(b).get(i));
				dir = 3;
				b--;
			} else {// b to t
				for (int i = b; i >= t; --i)
					result.add(A.get(i).get(l));
				dir = 0;
				l++;
			}
		}
		System.out.println(result.toString());
		return result;
	}
}
