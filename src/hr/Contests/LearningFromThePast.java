package hr.Contests;

import java.util.Scanner;

public class LearningFromThePast {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int i,j=0,index,max=0,firstMax,secondMax,finalMax=-1;
		int[] trades;
		int[] profits=new int[n];
		for(i=0;i<n;i++){
			firstMax=-1;
			secondMax=-1;
			
			trades=new int[3];
			
			trades[0]=sc.nextInt();
			firstMax=trades[0];
			index=0;
			
			trades[1]=sc.nextInt();
			if(firstMax<=trades[1]){
				firstMax=trades[1];
				index=1;
			}
			
			trades[2]=sc.nextInt();
			if(firstMax<=trades[2]){
				firstMax=trades[2];
				index=2;
			}
			
			for(int k=0;k<3;k++){
				if(k==index)
					continue;
				else{
					if(secondMax<trades[k]){
						secondMax=trades[k];
					}
				}
			}
			
//			System.out.println("First:"+firstMax+" Second:"+secondMax);
			
			profits[j]=firstMax+secondMax;
//			System.out.println("sum:"+profits[j]);
			if(finalMax<=profits[j]){
				finalMax=profits[j];
			}
			j++;
		}
		System.out.println("Final:"+finalMax);
	}
}
