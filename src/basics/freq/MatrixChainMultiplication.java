package basics.freq;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MatrixChainMultiplication {
	public static void main(String[] subhani) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());// dims.length --> #matrices = dims.length-1
		int[] dims = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < n; ++i)
			dims[i] = Integer.parseInt(st.nextToken());
		solution(n, dims);
	}

	public static void solution(int n, int[] dims) {
		int[][] m = new int[n][n];
		int i, j, k, L, q;// L=chain length
		for (i = 0; i < n; ++i)
			m[i][i] = 0;
		for (L = 2; L < n; ++L) {
			for (i = 1; i < n - L + 1; ++i) {
				j = i + L - 1;
				if (j == n)
					continue;
				m[i][j] = Integer.MAX_VALUE;
				for (k = i; k <= j - 1; ++k) {
					System.out.println("L:" + L + " [i,k]:[" + i + "," + k + "] [k+1,j]:[" + (k + 1) + "," + j + "]");
					q = m[i][k] + m[k + 1][j] + dims[i - 1] * dims[k] * dims[j];
					m[i][j] = Math.min(m[i][j], q);
					print(m);
				}
			}
		}
		System.out.println(m[1][n - 1]);
	}

	public static int matChainMulti(int[] dims, int i, int j) {
		if (i == j)
			return 0;
		int min = Integer.MAX_VALUE;
		for (int k = i; k < j; ++k) {
			int count = matChainMulti(dims, i, k) + matChainMulti(dims, k + 1, j) + dims[i - 1] * dims[k] * dims[j];
			if (count < min) {
				min = count;
			}
		}
		return min;
	}

	public static void print(int[][] arr) {
		for (int i = 0; i < arr.length; ++i) {
			for (int j = 0; j < arr[i].length; ++j)
				System.out.print(arr[i][j] + " ");
			System.out.println();
		}
		System.out.println("---------------------------");
	}
}
