package gfg.ds.Arrays.orderedStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class KthLargestContiguousSum {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		kthLargestContiguousSum(arr, k);
	}

	public static void kthLargestContiguousSum(int[] arr, int k) {

		int n = arr.length, i, j;
		int[] sum = new int[n + 1];

		sum[0] = 0;
		for (i = 1; i <= n; i++)
			sum[i] = sum[i - 1] + arr[i - 1];

		printArray(sum);
		PriorityQueue<Integer> q = new PriorityQueue<Integer>();// Min-Heap

		// sum of contiguous array from index i to j is sum[j]-sum[i-1]

		for (i = 1; i <= n; i++) {
			for (j = i; j <= n; j++) {

				int x = sum[j] - sum[i - 1];
				if (q.size() < k)
					q.add(x);
				else if (q.peek() < x) { // size>k && root<x(contiguous subarray sum)
					q.poll();
					q.add(x);
				}
				// printHeap(q);
			}
		}

		System.out.println("kth largest contiguous sum::" + q.peek());
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
