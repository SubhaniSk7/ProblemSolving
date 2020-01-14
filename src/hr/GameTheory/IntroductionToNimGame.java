package hr.GameTheory;

import java.util.Scanner;

public class IntroductionToNimGame {
	public static void main(String subhani[]){
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int i,j,n,k;
		int[] stones;
		int xor=0,max=Integer.MIN_VALUE;
		int[] result=new int[t];
		String[] binary;
		for(i=0;i<t;i++){
			xor=0;
			n=sc.nextInt();
			stones=new int[n];
			for(j=0;j<n;j++){
				stones[j]=sc.nextInt();
				xor^=stones[j];
			}
			if(xor==0){
				result[i]=2;
			}else{
				result[i]=1;
			}
		}
		for(i=0;i<t;i++){
			if(result[i]==1){
				System.out.println("First");
			}
			else{
				System.out.println("Second");
			}
		}
	}
}
