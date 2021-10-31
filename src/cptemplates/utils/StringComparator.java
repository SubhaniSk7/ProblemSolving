package cptemplates.utils;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StringComparator {
	public static String sort_1(String[] nums, int k) {
		Comparator<String> comp = new Comparator<String>() {
			@Override
			public int compare(String a, String b) {
				if (a.length() < b.length())
					return -1;
				else if (a.length() > b.length())
					return 1;
				else {
					for (int i = 0; i < a.length(); i++) {
						if (a.charAt(i) < b.charAt(i))
							return -1;
						else if (a.charAt(i) > b.charAt(i))
							return 1;
					}
					return -1;
				}
			}
		};
		PriorityQueue<String> pq = new PriorityQueue<>(comp);// min heap
		for (String s : nums) {
			pq.offer(s);
			if (pq.size() > k)
				pq.poll();
		}

		return pq.peek();
	}

	public static String sort_2(String[] nums, int k) {
		PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
			if (a.length() == b.length())
				return a.compareTo(b);
			return Integer.compare(a.length(), b.length());
		});// min heap
		for (String s : nums) {
			pq.offer(s);
			if (pq.size() > k)
				pq.poll();
		}

		return pq.peek();
	}
}
