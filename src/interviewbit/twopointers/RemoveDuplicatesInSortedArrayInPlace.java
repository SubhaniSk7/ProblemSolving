package interviewbit.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.StringTokenizer;

public class RemoveDuplicatesInSortedArrayInPlace {

	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());// #elements
		ArrayList<Integer> a = new ArrayList<Integer>();
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			a.add(Integer.parseInt(st.nextToken()));
		System.out.println(removeDuplicates(a));
	}

	public static int removeDuplicates(ArrayList<Integer> a) {
		int n = a.size();
		ArrayList<Integer> b = new ArrayList<Integer>();
		for (int i = 0; i < n; ++i) {
			if (!b.contains(a.get(i)))
				b.add(a.get(i));
		}
		a.clear();
		Iterator<Integer> itr = b.iterator();
		while (itr.hasNext())
			a.add(itr.next());
		return a.size();
	}
}
