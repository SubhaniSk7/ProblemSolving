package hr.general;
import java.util.Scanner;

public class MinimumDistance {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int i, max = -1, j;
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		int[] count = new int[max + 1];
		int dis[] = new int[max + 1];
		for (i = 0; i < n; i++) {
			dis[arr[i]] = 1000000;
		}
		for (i = 0; i < n - 1; i++) {
			for (j = i + 1; j < n; j++) {
				if (arr[i] == arr[j] && dis[arr[i]] > (j - i)) {
					// System.out.println(arr[i] + ":" + (j - i));
					dis[arr[i]] = j - i;
				}
			}
		}
		int min = 1000000;
		for (i = 0; i < max + 1; i++) {
			// System.out.print(dis[i] + " ");
			if (dis[i] != 0 && min > dis[i])
				min = dis[i];
		}
		if (min == 1000000)
			System.out.println(-1);
		else
			System.out.println(min);
	}
}
