package cptemplates;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import cptemplates.utils.Pair;

public class ArrayListArrayListComparator {

	public static void main(String[] subhani) throws IOException, NumberFormatException {
		ArrayList<ArrayList<Integer>> result = new ArrayList<>();

		ArrayList<Integer> a1 = new ArrayList<Integer>();
		a1.add(1);
		ArrayList<Integer> a2 = new ArrayList<Integer>();
		a2.add(1);
		a2.add(2);
		ArrayList<Integer> a3 = new ArrayList<Integer>();
		a3.add(4);
		a3.add(3);
		a3.add(1);
		a3.add(3);
		result.add(a1);
		result.add(a2);
		result.add(a3);
		System.out.println(a3.toString());
		Collections.sort(a3, new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println(a3.toString());
				System.out.println(o1 + " " + o2);
				System.out.println(o1.compareTo(o2));
				return o1.compareTo(o2);
			}
		});
		System.out.println(a3.toString());

		Collections.sort(result, new Comparator<ArrayList<Integer>>() {
			@Override
			public int compare(ArrayList<Integer> list1, ArrayList<Integer> list2) {
				int swap = 0, i = 0, j = 0;
				for (i = 0, j = 0; i < list1.size() && j < list2.size() && swap == 0; i++, j++) {
					swap = list1.get(i).compareTo(list2.get(j));
				}
				return swap;
			}
		});
		System.out.println(result.toString());
	}

	public void comp_1() {
		ArrayList<Pair> al = new ArrayList<>();
		Collections.sort(al, new Comparator<Pair>() {
			@Override
			public int compare(Pair o1, Pair o2) {
				Integer a = o1.z;
				Integer b = o2.z;
				return a.compareTo(b);
			}
		});
		System.out.println(al.toString());
	}

	public void comp_2() {
		ArrayList<PairCell> al = new ArrayList<>();

		al.add(new PairCell(1, 2, 3));
		al.add(new PairCell(-1, 2, 3));
		al.add(new PairCell(2, 2, 3));
		al.add(new PairCell(0, 2, 3));
		Collections.sort(al);
		System.out.println(al);
	}
}

class PairCell implements Comparable<PairCell> {
	int distance, r, c;

	PairCell(int d, int x, int y) {
		distance = d;
		r = x;
		c = y;
	}

	@Override
	public String toString() {
		return "[" + distance + " " + r + " " + c + "]";
	}

	@Override
	public int compareTo(PairCell o) {
		return distance - o.distance;
	}
}