package codechefDSlearning;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class LOWSUM_LowestSum {
//	static PriorityQueue<SumValue> pq;
	static int k, Q;
	static long[] motivation, satisfaction;

	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		while (t-- > 0) {
//			pq = new PriorityQueue<>((a, b) -> Long.compare(a.sum, b.sum));
			StringTokenizer st = new StringTokenizer(br.readLine());
			k = Integer.parseInt(st.nextToken());
			Q = Integer.parseInt(st.nextToken());
			motivation = new long[k];
			satisfaction = new long[k];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < k; i++)
				motivation[i] = Long.parseLong(st.nextToken());
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < k; i++)
				satisfaction[i] = Long.parseLong(st.nextToken());
			Arrays.sort(motivation);
			Arrays.sort(satisfaction);
//			solve();
			int size = Math.min(1000, k);
			long[] result = new long[size * size];
			int l = 0;
			for (int i = 0; i < size; ++i) {
				for (int j = 0; j < size; ++j)
					result[l++] = motivation[i] + satisfaction[j];
			}
			Arrays.sort(result);
			for (int i = 0; i < Q; i++) {
				int q = Integer.parseInt(br.readLine());
				System.out.println(result[q - 1]);
			}
		}
	}

//	public static void solve() {
//		for (int i = 0; i < K; ++i)
//			pq.offer(new SumValue(motivation[i] + satisfaction[0], i, 0));
//		for (int q = 0; q < 10010; ++q) {
//			if (pq.isEmpty())
//				break;
//			SumValue cur = pq.poll();
//			result[q] = cur.sum;
//			int i = cur.i, j = cur.j + 1;
//			if (j < K)
//				pq.offer(new SumValue(motivation[i] + satisfaction[j], i, j));
//		}
//	}
}
//class SumValue {
//	long sum;
//	int i, j;
//
//	SumValue(long sum, int i, int j) {
//		this.sum = sum;
//		this.i = i;
//		this.j = j;
//	}
//}
