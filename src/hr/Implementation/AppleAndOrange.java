package hr.Implementation;

import java.util.Scanner;

public class AppleAndOrange {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		int s=sc.nextInt();
		int t=sc.nextInt();
		int a=sc.nextInt();
		int b=sc.nextInt();
		int m=sc.nextInt();
		int n=sc.nextInt();
		int[] marr=new int[m];
		int[] narr=new int[n];
		
		int i,mcount=0,ncount=0;
		for(i=0;i<m;i++){
			marr[0]=sc.nextInt();
			if(marr[0]+a<s || marr[0]+a>t){
				continue;
			}
			if(marr[0]+a>=s && marr[0]+a<=t){
				mcount++;
			}
		}
		for(i=0;i<n;i++){
			narr[0]=sc.nextInt();
			if(narr[0]+b<s || narr[0]+b>t){
				continue;
			}
			if(narr[0]+b>=s && narr[0]+b<=t){
				ncount++;
			}
		}
//		System.out.println("mcount:"+mcount+" ncount:"+ncount);
		System.out.println(mcount);
		System.out.println(ncount);
	}
}
