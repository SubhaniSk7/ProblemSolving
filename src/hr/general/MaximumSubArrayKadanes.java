package hr.general;
import java.util.Arrays;
import java.util.Scanner;

public class MaximumSubArrayKadanes {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int i, j,min, generalSum = 0, maxSoFar = 0, maxEndingHere = 0;
		int t = sc.nextInt(), n;
		int[] arr;
		int[][] output = new int[t][2];
		for (j = 0; j < t; j++) {
			min=Integer.MAX_VALUE;
			generalSum = 0;
			maxSoFar = Integer.MIN_VALUE;
			maxEndingHere = 0;
			
			n = sc.nextInt();
			arr = new int[n];
			for (i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
				if(min>arr[i])
					min=arr[i];
			}
			for(i=0;i<n;i++){
				maxEndingHere=max(maxEndingHere+arr[i],arr[i]);
				maxSoFar=max(maxEndingHere,maxSoFar);
			}
			Arrays.sort(arr);
			for (i = n - 1; i >= 0; i--) {
				if (i == n - 1) {
					generalSum += arr[i];
				} else {
					if (generalSum + arr[i] < generalSum)
						break;
					else
						generalSum += arr[i];
				}
			}
			output[j][0]=maxSoFar;
			output[j][1] = generalSum;
		}
		for (i = 0; i < t; i++) {
			System.out.println(output[i][0] + " " + output[i][1]);
		}
	}
	public static int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
