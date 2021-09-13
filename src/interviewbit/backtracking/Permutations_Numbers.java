package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Permutations_Numbers {

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> in = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			in.add(Integer.parseInt(st.nextToken()));
		ArrayList<ArrayList<Integer>> ans = permute(in);
		for (ArrayList<Integer> a : ans)
			System.out.println(a.toString());
	}

	public static ArrayList<ArrayList<Integer>> result = new ArrayList<>();

	public static ArrayList<ArrayList<Integer>> permute(ArrayList<Integer> A) {
		generate(A, 0, A.size() - 1);
		return result;
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
