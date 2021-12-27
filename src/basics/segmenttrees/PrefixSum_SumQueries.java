package basics.segmenttrees;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// static array:no updation in array
public class PrefixSum_SumQueries {
	public static void main(String[] subhani) throws IOException, NumberFormatException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n], prefSum = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			arr[i] = Integer.parseInt(st.nextToken());

		prefSum[0] = arr[0];
		for (int i = 1; i < n; ++i)
			prefSum[i] = prefSum[i - 1] + arr[i];

		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken()), b = Integer.parseInt(st.nextToken());
		if (a == 0)
			System.out.println(prefSum[b]);
		else
			System.out.println(prefSum[b] - prefSum[a - 1]);
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