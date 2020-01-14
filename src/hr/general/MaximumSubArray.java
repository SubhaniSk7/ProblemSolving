package hr.general;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArray {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int i, j, generalSum = 0;
		int t = sc.nextInt(), n;
		int[] arr;
		int[][] output = new int[t][2];
		for (j = 0; j < t; j++) {
			generalSum = 0;
			n = sc.nextInt();
			arr = new int[n];
			for (i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			int result = maxSubArray(arr, 0, arr.length - 1);
			Arrays.sort(arr);
			for (i = n - 1; i >= 0; i--) {
				if (i == n - 1) {
					generalSum = arr[i];
				} else {
					if (generalSum + arr[i] < generalSum)
						break;
					else
						generalSum += arr[i];
				}
			}
			output[j][0] = result;
			output[j][1] = generalSum;
		}
		for (i = 0; i < t; i++) {
			System.out.println(output[i][0] + " " + output[i][1]);
		}
	}

	public static int maxSubArray(int[] arr, int low, int high) {

		if (low == high) {
			return arr[low];
		} else {
			int mid = (low + high) / 2;

			return max(maxSubArray(arr, low, mid),
					maxSubArray(arr, mid + 1, high),
					crossMaxSubArray(arr, low, mid, high));
		}
	}

	public static int crossMaxSubArray(int[] arr, int low, int mid, int high) {

		int leftSum = Integer.MIN_VALUE, rightSum = Integer.MIN_VALUE, sum = 0;
		int i, j;

		for (i = mid; i >= 0; i--) {
			sum += arr[i];
			if (leftSum < sum) {
				leftSum = sum;
			}
		}
		sum = 0;
		for (i = mid + 1; i <= high; i++) {
			sum += arr[i];
			if (rightSum < sum) {
				rightSum = sum;
			}
		}
		return leftSum + rightSum;
	}

	public static int max(int leftSum, int rightSum) {
		return (leftSum > rightSum) ? leftSum : rightSum;
	}

	public static int max(int leftSum, int rightSum, int crossSum) {
		return max(max(leftSum, rightSum), crossSum);
	}
}
