package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MinMaxRiddle {

	public static long[] riddle(long[] arr) {
		int n = arr.length;
		long[] result = new long[n];
		for (int i = 0; i < n; ++i) {
			long min = Long.MAX_VALUE;
			int index = 0;
			for (int j = i; j < n; ++j) {
				min = Math.min(min, arr[j]);
				if (result[index] < min)
					result[index] = min;
				index++;
			}
		}
		return result;
	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] arr = new long[n];

		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; i++)
			arr[i] = Long.parseLong(st.nextToken());
		long[] res = riddle(arr);
		System.out.println(Arrays.toString(res));
	}
}