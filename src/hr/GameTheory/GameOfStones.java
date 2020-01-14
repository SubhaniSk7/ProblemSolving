package hr.GameTheory;

import java.util.Scanner;

public class GameOfStones {

	public static void main(String subhani[]){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt(),i;
		int[] n=new int[t];
		for(i=0;i<t;i++)
			n[i]=sc.nextInt();
		i=0;
		while(t>0){
			
			if(n[i]%7==0 || n[i]%7==1){
				System.out.println("Second");
			}
			else{
				System.out.println("First");
			}
			i++;
			t--;
		}
	}
}
