package hr.Sorting;

import java.util.Scanner;

public class QuickSort1 {

	public static void main(String subhani[]) {

		Scanner sc = new Scanner(System.in);
		int i, n;
		n = sc.nextInt();
		int[] arr = new int[n];

		for (i = 0; i < n; i++)
			arr[i] = sc.nextInt();
		if(n>1)
			quickSort(arr, 0, n - 1);
		else
			System.out.println(arr[0]);
	}

	public static void quickSort(int[] arr, int start, int end) {

		if (start < end) {

			int pivotIndex = partition(arr, start, end);
			int i;
			
			for (i = 1; i < pivotIndex; i++) {
				System.out.print(arr[i]+" ");
			}
			System.out.print(arr[start]);
			for(i=end;i>=pivotIndex;i--){
				System.out.print(" "+arr[i]);
			}
			System.out.println();
		}
	}

	public static int partition(int[] arr, int start, int end) {

		int pivotElement = arr[start];

		int i = start, j, temp;
		for (j = start+1; j <= end; j++) {

			if (arr[j] <= pivotElement) {
				i++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		return i+1;
	}
}
