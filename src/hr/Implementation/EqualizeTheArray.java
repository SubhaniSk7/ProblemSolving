package hr.Implementation;

import java.util.Scanner;

public class EqualizeTheArray {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		int i, max = Integer.MIN_VALUE,sum=0;
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			if (max < arr[i])
				max = arr[i];
		}
		int[] count=new int[max+1];
		for(i=0;i<n;i++){
			count[arr[i]]+=1;
		}
		max=Integer.MIN_VALUE;
		for(i=0;i<count.length;i++){
			sum+=count[i];
			if(max<count[i]){
				max=count[i];
			}
		}
		System.out.println(sum-max);
		
	}
}
