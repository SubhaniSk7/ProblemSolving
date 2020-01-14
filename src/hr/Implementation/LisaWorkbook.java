package hr.Implementation;

import java.util.Scanner;

public class LisaWorkbook {

	public static void main(String subhani[]){
		Scanner sc=new Scanner(System.in);
		
		int n=sc.nextInt();
		int k=sc.nextInt();
		int[] problems=new int[n];
		int i,j,pageno=1,startproblem,endproblem,count=0;
		for(i=0;i<n;i++){
			problems[i]=sc.nextInt();
		}
		
		for(i=0;i<n;i++){
			startproblem=1;
			endproblem=problems[i];
			for(j=1;j<=problems[i];){
				endproblem=startproblem+k-1;
				if(endproblem > problems[i]){
					endproblem=problems[i];
				}
//				System.out.println(pageno+"-"+startproblem+":"+endproblem);
				if(pageno>=startproblem && pageno<=endproblem){
					count++;
				}
				startproblem=endproblem+1;
				j=j+k;
				
				pageno++;
			}
//			System.out.println();
		}
		System.out.println(count);
	}
}
