package gfg.ds.Arrays.orderedStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KMaxSumOverlapContiguousArrays {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n], barr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			barr[i] = Integer.parseInt(st.nextToken());

		kMaxSumComb_1(arr, barr, k);
	}

	public static void kMaxSumComb_1(int[] arr, int[] barr, int k) {
		int i, j, n = arr.length;

		PriorityQueue<Integer> maxHeap = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (i = 0; i < n; i++) {
			for (j = 0; j < n; j++) {
				int sum = arr[i] + barr[j];
				maxHeap.add(sum);
			}
		}
		// printHeap(maxHeap);

		int result = -1;
		System.out.println(k + " max sums after combination sum of two arrays:");
		for (i = 0; i < k; i++) {
			result = maxHeap.poll();
			System.out.println(result);
		}
	}

	public static void kMaxSumComb_2(int[] arr, int[] barr, int k) {

		Arrays.parallelSort(arr);
		Arrays.parallelSort(barr);
	}

	public static void printHeap(PriorityQueue<Integer> q) {
		Iterator<Integer> itr = q.iterator();
		while (itr.hasNext())
			System.out.print(itr.next() + " ");
		System.out.println();
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
