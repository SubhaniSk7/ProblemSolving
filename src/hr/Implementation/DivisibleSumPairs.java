package hr.Implementation;

import java.util.Scanner;

public class DivisibleSumPairs {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int i,j,count=0;
		int[] arr=new int[n];
		
		for(i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(i=0;i<n-1;i++){
			for(j=i+1;j<n;j++){
				if((arr[i]+arr[j])%k==0){
					count+=1;
				}
			}
		}
		System.out.println(count);
	}
}
