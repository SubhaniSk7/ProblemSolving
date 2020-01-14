package hr.Implementation;
import java.util.Scanner;

public class FindDigits {

	public static void main(String subhani[]){
		Scanner sc=new Scanner(System.in);
		
		int t=sc.nextInt();
		int count=0,n,i=0,d;
		int[] total=new int[t];
		int t1=t;
		while(t>0){
			count=0;
			n=sc.nextInt();
			int temp=n;
			while(n!=0){
				d=n%10;
				n=n/10;
//				System.out.println("n:"+n+" d:"+d);
				if(d!=0 && temp%d==0){
					count++;
				}
			}
			
			total[i++]=count;
			t--;
		}
		for(i=0;i<t1;i++){
			System.out.println(total[i]);
		}
	}
}
