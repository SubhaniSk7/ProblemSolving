package hr.GameTheory;

import java.util.Scanner;

public class TowerBreakers {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int[] winner=new int[t];
		int j=0;
		
		while(t>0){
			int n=sc.nextInt();
			int x=sc.nextInt();
			
			if((x==1 || n%2==0 ))
				winner[j]=2;
			else
				winner[j]=1;
			j++;
			t--;
		}
		
		for(j=0;j<winner.length;j++){
			System.out.println(winner[j]);
		}
	}
}
