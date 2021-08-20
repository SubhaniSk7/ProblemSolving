package interviewbit.arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.StringTokenizer;

public class LargestNumber {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] nums = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			nums[i] = Integer.parseInt(st.nextToken());
		System.out.println(largestNumber(nums));
	}

	public static String largestNumber(int[] A) {
		int n = A.length;
		String result = "";
		ArrayList<String> s = new ArrayList<String>();
		for (int i = 0; i < n; ++i)
			s.add("" + A[i]);
//		Collections.sort(s, new Comparator<String>() {
//			@Override
//			public int compare(String o1, String o2) {
//				String a = o1 + o2;
//				String b = o2 + o1;
//				return a.compareTo(b) > 0 ? -1 : 1;
//			}
//		});
		Collections.sort(s, (a, b) -> (b + a).compareTo(a + b));

		Iterator<String> itr = s.iterator();
		StringBuilder sb = new StringBuilder();
		while (itr.hasNext())
			sb.append(itr.next());

		result = sb.toString();
		result = result.replaceFirst("^0*", "");
		if (result.isEmpty())
			result = "0";
		return result;
	}
}
