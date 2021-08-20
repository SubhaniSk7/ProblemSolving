package interviewbit.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MergeTwoSortedLists {
	public static void main(String subhani[]) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), m = Integer.parseInt(st.nextToken()), i;
		ArrayList<Integer> a = new ArrayList<Integer>(), b = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			a.add(Integer.parseInt(st.nextToken()));
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < m; i++)
			b.add(Integer.parseInt(st.nextToken()));
		merge(a, b);
	}

	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		int k = 0, i = 0;
		if (b.size() == 0)
			return;
		while (i < a.size() && k < b.size()) {
			if (a.get(i) < b.get(k)) {
				i++;
			} else if (a.get(i) == b.get(k)) {
				a.add(i + 1, b.get(k));
				i++;
				k++;
			} else if (a.get(i) > b.get(k)) {
				a.add(i, b.get(k));
				i++;
				k++;
			}
		}
		i = a.size();
		while (k < b.size()) {
			a.add(i++, b.get(k++));
		}
		System.out.println(a.toString());
//		a.addAll(b);
//		Collections.sort(a);
	}
}
