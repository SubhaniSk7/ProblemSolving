package basics.segmenttrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.StringTokenizer;

// if range is = power of 2 -> min( min(a,a+w-1), min(a+w,b)) w=(b-a+1)/2 = divides into half
// else = min( min(a,a+k-1), min(b-k+1,b)) k=largest power of 2 for that range = k&-k
public class MinimumQueries {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());
		Map<String, Integer> map = new HashMap<String, Integer>();
		int log = (int) (Math.log10(n) / Math.log10(2));
		for (int i = 0; i < n; ++i) {
			for (int window = 1; window <= Math.pow(2, log); window *= 2) {
				int min = Integer.MAX_VALUE;
				if (i + window <= n) {
					for (int j = i; j < i + window; ++j)
						min = Math.min(min, arr[j]);
					map.put((i + 1) + "-" + (i + window), min);
				}
			}
		}
		Iterator<Entry<String, Integer>> itr = map.entrySet().iterator();
		while (itr.hasNext()) {
			Map.Entry<String, Integer> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue());
		}

		System.out.println("enter interval [a,b] index from 1->n:");
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		int range = b - a + 1;
		if (powerOf2(range)) {
			int w = (b - a + 1) / 2;
			System.out.println(a + "-" + (a + w - 1) + "  " + (a + w) + "-" + b);
			System.out.println(Math.min(map.get(a + "-" + (a + w - 1)), map.get((a + w) + "-" + b)));
		} else {
			int k = largestPowerOf2(range);
			System.out.println(a + "-" + (a + k - 1) + "  " + (b - k + 1) + "-" + b);
			System.out.println(Math.min(map.get(a + "-" + (a + k - 1)), map.get((b - k + 1) + "-" + b)));
		}
	}

	public static boolean powerOf2(int range) { // power of 2 or not
		return (int) (Math.ceil(Math.log(range) / Math.log(2))) == (int) (Math.floor(Math.log(range) / Math.log(2)));
	}

	public static int largestPowerOf2(int range) {// largest power of 2 <=n
		int p = (int) (Math.log(range) / Math.log(2));
		return (int) Math.pow(2, p);
	}
}
//i/p:
//	8
//	1 3 4 8 6 1 4 2
