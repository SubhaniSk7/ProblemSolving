package hr.Search;

import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {

	public static void main(String subhani[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] A = new int[n];
		int i,j, max = Integer.MIN_VALUE,min=Integer.MAX_VALUE;

		for (i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		int[] B = new int[m];
		for (i = 0; i < m; i++) {
			B[i] = sc.nextInt();
			if (max < B[i])
				max = B[i];
			if(min>B[i])
				min=B[i];
		}
		int[] Acount = new int[max-min+1];
		int[] Bcount = new int[max-min+1];
		int[] result=new int[max-min+1];
		for (i = 0; i < n; i++) {
			Acount[A[i]-min] += 1;
		}
		for (i = 0; i < m; i++) {
			Bcount[B[i]-min] += 1;
		}
		j=0;
		for(i=0;i<Bcount.length;i++){
			if(Acount[i]!=Bcount[i]){
				result[j]=min+i;
				j++;
			}
		}
		Arrays.sort(result);
		for(i=0;i<result.length;i++){
			if(result[i]==0)
				continue;
			System.out.print(result[i]+" ");
		}
	}
}
