package leetproblems;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Q01_TwoSum {
	public static void main(String subhani[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()), target = Integer.parseInt(st.nextToken());
		int i;
		int[] arr = new int[n];
		st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			arr[i] = Integer.parseInt(st.nextToken());
		int[] result = new Q01_TwoSum().twoSum(arr, target);
		System.out.println(Arrays.toString(result));
	}

//	public static int[] sumIndices(int[] arr, int target) {
//		int n = arr.length, i;
//		int[] result = new int[2];
//		for (i = 0; i < n - 1; i++) {
//			boolean done = false;
//			for (int j = i + 1; j < n; j++)
//				if (arr[i] + arr[j] == target) {
//					result[0] = i;
//					result[1] = j;
//					done = true;
//					break;
//				}
//			if (done)
//				break;
//		}
//		return result;
//	}

	public int[] twoSum(int[] arr, int target) {
		int n = arr.length;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < n; i++) {
			int need = target - arr[i];
			if (map.containsKey(need))
				return new int[] { i, map.get(need) };
			map.put(arr[i], i);
		}
		return new int[] {};
	}
}
