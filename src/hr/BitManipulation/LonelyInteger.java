package hr.BitManipulation;

import java.util.Scanner;

public class LonelyInteger {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i,number;
		int[] arr=new int[n];
		for(i=0;i<n;i++)
			arr[i]=sc.nextInt();
		number=arr[0];
		for(i=1;i<n;i++){
			number^=arr[i];
		}
		System.out.println(number);
	}
}
