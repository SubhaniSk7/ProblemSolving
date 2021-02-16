package basics.binarysearch;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class FindPeakElement {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		int[] a = new int[n];
		for (int i = 0; i < n; ++i)
			a[i] = Integer.parseInt(st.nextToken());
		int index = peak(a, 0, n - 1, n);
		System.out.println("index of peak:" + index);
	}

	public static int peak(int[] a, int start, int end, int n) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (mid == 0 && a[mid + 1] <= a[mid])
				return mid;
			if (mid == n - 1 && a[mid - 1] <= a[mid])
				return mid;
//			if ((mid == 0 || a[mid - 1] <= a[mid]) && (mid == n - 1 || a[mid + 1] <= a[mid]))
//				return mid;
			if (a[mid + 1] <= a[mid] && a[mid - 1] <= a[mid])
				return mid;
			else if (mid > 0 && a[mid - 1] > a[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;
	}
}
