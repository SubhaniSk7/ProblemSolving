package basics.rangeQueries;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// static array:no updation in array
// sum in range [a,b] = sum[0,b]-sum[0,a-1] ; sum[-1]=0 is works for if a=b=0; 0<=a,b<=n-1
public class PrefixSum_SumQueries {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n], sum = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());

		sum[0] = arr[0];
		for (int i = 1; i < n; ++i)
			sum[i] = sum[i - 1] + arr[i];
		print(sum, n);

		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		if (a == 0)
			System.out.println(sum[b]);
		else
			System.out.println(sum[b] - sum[a - 1]);
	}

	public static void print(int[] arr, int n) {
		for (int i = 0; i < n; ++i)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
//i/p:
//	8
//	1 3 4 8 6 1 4 2
// query1: 0 0
// query2: 2 5
//o/p:
//	1 4 8 16 22 23 27 29 
// query1: 
// query2: 