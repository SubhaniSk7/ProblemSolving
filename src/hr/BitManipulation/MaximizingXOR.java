package hr.BitManipulation;

import java.util.Scanner;

public class MaximizingXOR {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		
		int L=sc.nextInt();
		int R=sc.nextInt();
		int i,j,max=0;
		for(i=L;i<R;i++){
			
			for(j=i+1;j<=R;j++){
				if(max<=(i^j)){
					max=(i^j);
				}
			}
		}
		System.out.println(max);
		
	}
}
