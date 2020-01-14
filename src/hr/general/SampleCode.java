package hr.general;
import java.util.Scanner;
public class SampleCode {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		int i,l,r,j,res=0;
		
		int[] seq=new int[t];
		j=0;
		
		while(t>0){
			res=0;
			l=sc.nextInt();
			r=sc.nextInt();
			for(i=l;i<=r;i++){
				if(i%4==0){
					res=res^i;
//					System.out.println("i:"+i+" one:"+xor);
				}
				if(i%4==1){
					res=res^1;
//					System.out.println("i:"+i+" two:"+xor);
				}
				if(i%4==2){
					res=res^(i+1);
//					System.out.println("i:"+i+" three:"+xor);
				}
				if(i%4==3){
					res=res^0;
//					System.out.println("i:"+i+" four:"+xor);
				}
				
			}
			seq[j]=res;
			j++;
			t--;
		}
		int k;
		for(k=0;k<seq.length;k++)
			System.out.println(seq[k]);
	}
}
