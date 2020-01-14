package gfg.ds.Arrays.rotations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MaxSumIxarrI {

	public static void main(String subhani[]) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());

		int[] arr = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());

		int i = 0;
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());

		maxSum_1(arr);// Brute-force=O(N2) --> for every rotation

		maxSum_2(arr);// Brute-force=O(N2) --> for every rotation

		maxSum_3(arr);// from pattern observation =O(N)

		maxSum_4(arr);// O(N) --> using pattern observation

		maxSum_5(arr);// O(N) --> using Pivot element i.e., difference
	}

	public static void maxSum_1(int[] arr) {

		int i, j, maxSum = -1, n = arr.length, currentSum;

		for (i = 0; i < n; i++) {

			int d = 1;
			int[] temp = new int[d];
			for (j = 0; j < d; j++)
				temp[j] = arr[j];
			for (j = 0; j < n - d; j++)
				arr[j] = arr[j + d];

			int k = 0;
			for (j = n - d; j < n; j++)
				arr[j] = temp[k++];

			currentSum = 0;
			for (j = 0; j < n; j++)
				currentSum += (j * arr[j]);

			if (currentSum > maxSum)
				maxSum = currentSum;
		}
		System.out.println(maxSum);
	}

	public static void maxSum_2(int[] arr) {// changed index--> calculate for every rotation

		int i, j, maxSum = -1, n = arr.length, currentSum, index;

		for (i = 0; i < n; i++) {

			currentSum = 0;
			for (j = 0; j < n; j++) {
				index = (i + j) % n;
				currentSum += (j * arr[index]);
			}
			if (currentSum > maxSum)
				maxSum = currentSum;
		}
		System.out.println(maxSum);
	}

	public static void maxSum_3(int[] arr) {// O(n)
		int i, n = arr.length, arrSum = 0, maxSum = -1, currentSum = 0;
		for (i = 0; i < n; i++) {
			arrSum += arr[i]; // arr[i]
			currentSum += (i * arr[i]);// add i*arr[i]
		}
		maxSum = currentSum;

		// rotate one by one and find sum
		for (i = 1; i < n; i++) {
			currentSum += arrSum - n * arr[n - i];// formula from observing pattern
			if (currentSum > maxSum)
				maxSum = currentSum;
		}
		System.out.println(maxSum);
	}

	public static void maxSum_4(int[] arr) {//

		int n = arr.length, arrSum = 0, current_sum = 0, i;
		for (i = 0; i < n; i++) {
			arrSum += arr[i];
			current_sum += i * arr[i];
		}

		int result = current_sum;
		for (i = 1; i < n; i++) {
			int next_sum = current_sum - (arrSum - arr[i - 1]) + arr[i - 1] * (n - 1);
			current_sum = next_sum;
			result = Math.max(result, next_sum);
		}
		System.out.println(result);
	}

	public static void maxSum_5(int[] arr) {// using pivot element

		int pivotIndex = findPivot(arr);
		int n = arr.length, difference = n - 1 - pivotIndex, i, sum = 0;

		for (i = 0; i < n; i++)
			sum = sum + (((i + difference) % n) * arr[i]);

		System.out.println(sum);

	}

	public static int findPivot(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n; i++)
			if (arr[i] > arr[(i + 1) % n])
				return i;
		return 0;
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

}
