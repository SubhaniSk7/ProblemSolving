package gfg.ds.Arrays.orderedStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class KPairsMinSum {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n1 = Integer.parseInt(st.nextToken()), n2 = Integer.parseInt(st.nextToken()),
				k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n1], barr = new int[n1];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n1; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n2; i++)
			barr[i] = Integer.parseInt(st.nextToken());

		//
		Arrays.parallelSort(arr);
		Arrays.parallelSort(barr);

		kPairsSmallestSum_1(arr, barr, k);

	}

	// Method 1 --> Naive approach -->O(n*n2*log(n1*n2)) ===> Need to Implement
	public static void kPairsSmallestSum_1(int[] arr, int[] barr, int k) {
		int n1 = arr.length, n2 = barr.length, i, j, l = 0;

		int[] result = new int[n1 * n2];

		// find all pairs and their sums
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		for (i = 0; i < n1; i++)
			for (j = 0; j < n2; j++) {
				String str = "[" + arr[i] + "," + barr[j] + "]";
				map.put(str, arr[i] + barr[j]);
			}

		for (Map.Entry<String, Integer> ent : map.entrySet()) {
			System.out.println(ent.getKey() + " " + ent.getValue());
		}

		// sort according to value and print first k pairs
	}

	public static void kPairsSmallestSum_2(int[] arr, int[] barr, int k) {

	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
