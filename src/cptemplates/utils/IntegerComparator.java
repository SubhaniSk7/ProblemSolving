package cptemplates.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

// Ascending Order sort_1, sort_2
// Descending Order sort_6, sort_7
public class IntegerComparator {
	public static void main(String[] subhani) {

		ArrayList<Integer> al = new ArrayList<Integer>();
		for (int i = 10; i > 0; --i) {
			al.add(i);
		}
		System.out.println(al.toString());
		sort_1(al);
		System.out.println(al.toString());
		sort_6(al);
		System.out.println(al.toString());
		sort_2(al);
		System.out.println(al.toString());
		sort_7(al);
		System.out.println(al.toString());
	}

	public static void sort_1(ArrayList<Integer> al) {// Ascending Order
		Collections.sort(al, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o1.compareTo(o2);
			}
		});
	}

	public static void sort_2(ArrayList<Integer> al) {// Ascending Order
		Collections.sort(al, (a, b) -> a.compareTo(b));
	}

	public static void sort_6(ArrayList<Integer> al) {// Descending Order
		Collections.sort(al, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1 > o2) ? -1 : (o1 == o2 ? 0 : 1);
			}
		});
	}

	public static void sort_7(ArrayList<Integer> al) {// Descending Order
		Collections.sort(al, (a, b) -> a.compareTo(b) >= 0 ? -1 : 1);
	}
}
