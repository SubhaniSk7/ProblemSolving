package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TripleSum {
	// Complete the triplets function below.
	static long triplets(int[] a, int[] b, int[] c) {
		int[] arr = Arrays.stream(a).sorted().distinct().toArray();
		int[] brr = Arrays.stream(b).sorted().distinct().toArray();
		int[] crr = Arrays.stream(c).sorted().distinct().toArray();

		long count = 0;
		int j = 0, k = 0;
		for (int i = 0; i < brr.length; ++i) {
			while (j < arr.length && arr[j] <= brr[i])
				j++;
			while (k < crr.length && crr[k] <= brr[i])
				k++;
			count += (long) j * (long) k;
		}
		return count;

	}

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int lena = Integer.parseInt(st.nextToken()), lenb = Integer.parseInt(st.nextToken()), lenc = Integer.parseInt(st.nextToken());
		int[] arra = new int[lena], arrb = new int[lenb], arrc = new int[lenc];
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < lena; i++)
			arra[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < lenb; i++)
			arrb[i] = Integer.parseInt(st.nextToken());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < lenc; i++)
			arrc[i] = Integer.parseInt(st.nextToken());

		long ans = triplets(arra, arrb, arrc);
		System.out.println(ans);
	}
}
