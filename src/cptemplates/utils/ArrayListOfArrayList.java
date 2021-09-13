package cptemplates.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ArrayListOfArrayList {

	public static void main(String[] subhani) {

		ArrayList<ArrayList<Integer>> al = new ArrayList<>();

		ArrayList<Integer> a = new ArrayList<>();
		a.add(1);
		a.add(2);
		a.add(3);
		ArrayList<Integer> b = new ArrayList<>();
		b.add(2);
		b.add(3);
		b.add(4);
		ArrayList<Integer> c = new ArrayList<>();
		c.add(2);
		c.add(1);
		c.add(4);
		ArrayList<Integer> d = new ArrayList<>();
		d.add(3);
		d.add(4);
		d.add(5);
		ArrayList<Integer> e = new ArrayList<>();
		e.add(3);
		e.add(2);
		e.add(7);

		al.add(a);
		al.add(d);
		al.add(c);
		al.add(e);
		al.add(b);

		System.out.println(al.toString());
		sort_1(al);
		System.out.println("asc on 1st:" + al.toString());
		sort_6(al);
		System.out.println("desc on 1st:" + al.toString());
		sort_2(al);
		System.out.println("asc on 2 vals:" + al.toString());
		sort_7(al);
		System.out.println("desc on 2 vals:" + al.toString());
	}

	public static void sort_1(ArrayList<ArrayList<Integer>> al) {// Ascending order on 1st val
		Comparator c = new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
				return o1.get(0).compareTo(o2.get(0));
			}
		};
		Collections.sort(al, c);
	}

	public static void sort_2(ArrayList<ArrayList<Integer>> al) {// Ascending order on first 2 values

	}

	public static void sort_6(ArrayList<ArrayList<Integer>> al) {// Descending order on 1st val

	}

	public static void sort_7(ArrayList<ArrayList<Integer>> al) {// Descending order on first 2 values

	}
}
