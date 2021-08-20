package interviewbit.heapsandmaps;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KLargestElements {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), K = Integer.parseInt(st.nextToken());
		int[] A = new int[n];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			A[i] = Integer.parseInt(st.nextToken());
		int[] result = kLargest(A, K);
	}

	public static int[] kLargest(int[] A, int B) {
		int n = A.length, i;
		PriorityQueue<Integer> q = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (i = 0; i < n; ++i)
			q.offer(A[i]);
		ArrayList<Integer> result = new ArrayList<Integer>();
		for (i = 0; i < B; ++i)
			result.add(q.poll());
		int[] res = new int[result.size()];
		i = 0;
		for (int l : result)
			res[i++] = l;
		return res;
	}
}
