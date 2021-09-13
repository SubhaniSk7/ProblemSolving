package cptemplates.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//-1 means swap
public class PairIntInt {

	int first, second;

	public PairIntInt(int first, int second) {
		this.first = first;
		this.second = second;
	}

	@Override
	public String toString() {
		return "[" + this.first + " " + this.second + "]";
	}

	public static void main(String[] subhani) {

		ArrayList<PairIntInt> al = new ArrayList<>();

		al.add(new PairIntInt(10, 8));
		al.add(new PairIntInt(5, 1));
		al.add(new PairIntInt(1, 2));
		al.add(new PairIntInt(1, 1));
		System.out.println(al.toString());

		sort_1(al);
		System.out.println("asc:" + al.toString());
		sort_6(al);
		System.out.println("desc:" + al.toString());
	}

	public static void sort_1(ArrayList<PairIntInt> al) {// Ascending Order
		Collections.sort(al, new Comparator<PairIntInt>() {
			@Override
			public int compare(PairIntInt p1, PairIntInt p2) {
				int firstComp = Integer.valueOf(p1.first).compareTo(Integer.valueOf(p2.first));
				int secondComp = Integer.valueOf(p1.second).compareTo(Integer.valueOf(p2.second));
				return firstComp == 0 ? secondComp : firstComp;
			}
		});
	}

	public static void sort_6(ArrayList<PairIntInt> al) {// Descending Order
		Collections.sort(al, new Comparator<PairIntInt>() {
			@Override
			public int compare(PairIntInt p1, PairIntInt p2) {
				int firstComp = Integer.valueOf(p1.first).compareTo(Integer.valueOf(p2.first));
				int secondComp = Integer.valueOf(p1.second).compareTo(Integer.valueOf(p2.second));
				return firstComp == 0 ? (secondComp >= 0 ? -1 : secondComp) : (firstComp >= 0 ? -1 : firstComp);
			}
		});
	}
}