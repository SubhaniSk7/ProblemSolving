package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class KthPermutationSequence {

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());
		System.out.println(getPermutation(n, k));
	}

	public static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

	public static String getPermutation(int n, int k) {
		ArrayList<Integer> A = new ArrayList<Integer>();
		for (int i = 1; i <= n; ++i)
			A.add(i);
		generate(A, 0, A.size() - 1);
		Collections.sort(result, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
				int swap = 0;
				for (int i = 0, j = 0; i < list1.size() && j < list2.size() && swap == 0; i++, j++) {
					swap = list1.get(i).compareTo(list2.get(j));
				}
				return swap;
			}
		});
		String s = "";
		for (int ele : result.get(k - 1))
			s = s + ele;
		return s;
	}

	public static void generate(ArrayList<Integer> A, int l, int r) {
		if (l == r) {
			result.add(new ArrayList<Integer>(A));
			return;
		}
		for (int i = l; i <= r; ++i) {
			swap(A, l, i);
			generate(A, l + 1, r);
			swap(A, l, i);
		}
	}

	public static void swap(ArrayList<Integer> A, int i, int j) {
		int temp = A.get(i);
		A.set(i, A.get(j));
		A.set(j, temp);
	}
}
