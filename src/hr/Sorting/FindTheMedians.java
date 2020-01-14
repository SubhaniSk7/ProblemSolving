package hr.Sorting;

import java.util.Arrays;
import java.util.Scanner;

public class FindTheMedians {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i;
		int[] arr=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		Arrays.sort(arr);
		
		System.out.println(arr[n/2]);
    }
}