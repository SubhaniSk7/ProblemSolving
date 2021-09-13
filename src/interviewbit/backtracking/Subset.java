package interviewbit.backtracking;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Subset {
	public static Set<String> result;

	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> in = new ArrayList<Integer>();
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			in.add(Integer.parseInt(st.nextToken()));
		ArrayList<ArrayList<Integer>> ans = subsets(in);
		System.out.println(ans.toString());
	}

	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {
		result = new TreeSet<>();
		Collections.sort(A);
		subs(A, 0, "");

		ArrayList<ArrayList<Integer>> res = new ArrayList<>();
		Iterator<String> itr = result.iterator();
		while (itr.hasNext()) {
			String s = itr.next();
			ArrayList<Integer> al = new ArrayList<>();
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens())
				al.add(Integer.parseInt("" + st.nextToken()));
			res.add(al);
		}

		Collections.sort(res, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
				int swap = 0;
				for (int i = 0, j = 0; i < list1.size() && j < list2.size() && swap == 0; i++, j++) {
					swap = list1.get(i).compareTo(list2.get(j));
				}
				return swap;
			}
		});
		return res;
	}

	public static void subs(ArrayList<Integer> A, int index, String ans) {
		if (index == A.size()) {
			result.add(ans);
			return;
		}
		String a = ans + " " + A.get(index), b = ans;
		subs(A, index + 1, b);
		subs(A, index + 1, a);
	}
}
