package gfg.algos.Mathematical;

//Amazon
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Buses {

	public static void main(String subhani[]) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine()), i, j;
		int[] board = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (i = 0; i < n; i++)
			board[i] = Integer.parseInt(st.nextToken());
		origin(board, n);
	}

	public static void origin(int[] arr, int n) {

		int i, j, k = 1, ele;
		for (i = 1; i < n; i++) {
			// System.out.println("---------------");
			ele = arr[i - 1];
			for (j = i; j < n; j++) {
				// System.out.println("i:" + i + " j:" + j + " k:" + k + " ele:" + ele);
				if (j % k == 0)
					arr[j] -= ele;
				// printArray(arr);
			}
			k++;
		}
		printArray(arr);
	}

	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
}
