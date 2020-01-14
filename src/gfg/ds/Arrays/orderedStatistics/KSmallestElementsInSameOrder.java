package gfg.ds.Arrays.orderedStatistics;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class KSmallestElementsInSameOrder {
	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), k = Integer.parseInt(st.nextToken());

		int[] arr = new int[n], barr = new int[n];

		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		// kSmallestInSameOrder_1(arr, k);
		kSmallestInSameOrder_2(arr, k);
	}

	// Method 1 -->O(n log n)
	public static void kSmallestInSameOrder_1(int[] arr, int k) {
		int[] barr = Arrays.copyOf(arr, arr.length);

		Arrays.parallelSort(barr);

		for (int i = 0; i < arr.length; i++) {
			if (Arrays.binarySearch(barr, 0, k, arr[i]) > -1)
				System.out.print(arr[i] + " ");
		}
	}

	// Method 2 --> Insertion sort technique
	public static void kSmallestInSameOrder_2(int[] arr, int k) {

		int n = arr.length, i, j;
		for (i = k; i < n; i++) {
			int max = arr[k - 1];
			int pos = k - 1;
			for (j = k - 2; j >= 0; j--)// finding max in first k elements
				if (max < arr[j]) {
					max = arr[j];
					pos = j;
				}

			if (max > arr[i]) {// Replacing with max element like in Insertion sort technique
				while (pos < k - 1) {
					arr[pos] = arr[pos + 1];
					pos++;
				}
				arr[k - 1] = arr[i];
			}
		}

		for (i = 0; i < k; i++)
			System.out.print(arr[i] + " ");
		System.out.println();

	}

	// Incomplete --> need to implement
	public static void kSmallestInSameOrder_3(int[] arr, int k) {
		int max = Integer.MIN_VALUE, n = arr.length, i, j;
		for (i = 0; i < n; i++)
			if (max < arr[i])
				max = arr[i];

		int[] index = new int[max + 1], freq = new int[max + 1];

		for (i = 0; i < index.length; i++)
			index[i] = -1;

		for (i = 0; i < n; i++) {
			if (index[arr[i]] == -1)
				index[arr[i]] = i;
			freq[arr[i]] += 1;
		}

		int[] result = new int[k];
		j = k - 1;
		for (i = 0; i < index.length; i++) {
			if (freq[i] > 1) {
				result[j] = i;
				freq[i] -= 1;
				i--;
			} else if (freq[i] == 1) {
				result[j] = i;
			}
			j--;
			if (j < 0)
				break;
		}
		printArray(result);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
