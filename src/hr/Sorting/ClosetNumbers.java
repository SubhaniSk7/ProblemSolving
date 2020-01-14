package hr.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class ClosetNumbers {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] result = new int[n];
		int i, j = 0;
		int[] difference = new int[n];
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		int min = Integer.MAX_VALUE;
		for (i = 0; i < n-1; i++) {
			difference[j] = Math.abs(arr[i+1] - arr[i]);
			if (min >= difference[j]) {
				min = difference[j];
			}
			j++;
		}
		for(i=0;i<difference.length;i++){
			if(difference[i]==0)
				continue;
			if(min==difference[i]){
				System.out.print(arr[i]+" "+arr[i+1]+" ");
			}
		}
	}
}
