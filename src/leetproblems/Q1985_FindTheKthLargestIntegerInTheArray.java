package leetproblems;

import java.util.PriorityQueue;

public class Q1985_FindTheKthLargestIntegerInTheArray {
//	public String kthLargestNumber(String[] nums, int k) {
//		Comparator<String> comp = new Comparator<String>() {
//			@Override
//			public int compare(String a, String b) {
//				if (a.length() < b.length())
//					return -1;
//				else if (a.length() > b.length())
//					return 1;
//				else {
//					for (int i = 0; i < a.length(); i++) {
//						if (a.charAt(i) < b.charAt(i))
//							return -1;
//						else if (a.charAt(i) > b.charAt(i))
//							return 1;
//					}
//					return -1;
//				}
//			}
//		};
//		PriorityQueue<String> pq = new PriorityQueue<>(comp);
//		for (String s : nums) {
//			pq.offer(s);
//			if (pq.size() > k)
//				pq.poll();
//		}
//
//		return pq.peek();
//	}
	public String kthLargestNumber(String[] nums, int k) {
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
