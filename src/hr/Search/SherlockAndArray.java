package hr.Search;
import java.util.Scanner;

public class SherlockAndArray {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int n, i, j, k = 0, leftsum, rightsum;
		int[] result = new int[t];
		int temp = t;
		boolean flag;
		while (t > 0) {
			flag = false;
			leftsum = 0;
			rightsum = 0;
			n = sc.nextInt();
			int[] arr = new int[n];
			int[] left = new int[n];
			int[] right = new int[n];
			for (i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if (i == 0) {
					left[i] = leftsum;
				} else {
					leftsum += arr[i - 1];
					left[i] = leftsum;
				}
			}
			for (i = n - 1, j = n - 1; i >= 0; i--, j--) {
				if (i == n - 1) {
					right[i] = rightsum;
				} else {
					rightsum += arr[i + 1];
					right[i] = rightsum;
				}
				if (left[j] == right[j]) {
					flag = true;
					break;
				}
			}
			if (flag) {
				result[k++] = 1;
			} else {
				result[k++] = 0;
			}
//			for (i = 0; i < n; i++) {
//				System.out.print(left[i] + " ");
//			}
//			System.out.println();
//			for (i = 0; i < n; i++) {
//				System.out.print(right[i] + " ");
//			}
			t--;
		}
		for (i = 0; i < temp; i++) {
			if (result[i] == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}
