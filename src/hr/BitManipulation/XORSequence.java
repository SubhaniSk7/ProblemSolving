package hr.BitManipulation;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class XORSequence {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
//		int t=sc.nextInt();
//		int i,l,r,j,xor=0;
//		int[] arr=new int[100010];
//		int[] seq=new int[t];
//		arr[0]=0;
//		for(i=1;i<arr.length;i++){
//			arr[i]=arr[i-1]^i;
//		}
//		j=0;
//		while(t>0){
//
//			l=sc.nextInt();
//			r=sc.nextInt();
//			xor=arr[l];
//			for(i=l+1;i<=r;i++){
//				xor^=arr[i];
//			}
//			seq[j]=xor;
//			j++;
//			t--;
//		}
//		
//		for(i=0;i<seq.length;i++)
//			System.out.println(seq[i]);
//		
		
//		int t=sc.nextInt();
//		BigInteger i,l,r,xor;
//		ArrayList<Integer> arr=new ArrayList<Integer>();
//		ArrayList<Integer> seq=new ArrayList<Integer>();
//		
//		i=new BigInteger("0");
//		
//		for(;i<"1000000000000000";i++){
//			
//		}
		
		
		int t=sc.nextInt();
//		int i,l,r,j,xor=0;
		
		int j;
		BigInteger i=new BigInteger("0");
		BigInteger l,r,res;
		res=new BigInteger("0");
		l=new BigInteger("0");
		r=new BigInteger("0");
		
		int[] seq=new int[t];
		j=0;
		
		while(t>0){
			res=BigInteger.ZERO;
			l=sc.nextBigInteger();
			r=sc.nextBigInteger();
			for(i=l;i.compareTo(r) <= 0;i=i.add(BigInteger.ONE)){
//				if(i%4==0){
//					xor=xor^i;
////					System.out.println("i:"+i+" one:"+xor);
//				}
//				if(i%4==1){
//					xor=xor^1;
////					System.out.println("i:"+i+" two:"+xor);
//				}
//				if(i%4==2){
//					xor=xor^(i+1);
////					System.out.println("i:"+i+" three:"+xor);
//				}
//				if(i%4==3){
//					xor=xor^0;
////					System.out.println("i:"+i+" four:"+xor);
//				}

				if(i.mod(new BigInteger("4")).equals(BigInteger.ZERO)){
					
					res=res.xor(i);
				}
				if(i.mod(new BigInteger("4")).equals(BigInteger.ONE)){
					
					res=res.xor(new BigInteger("1"));
				}
				if(i.mod(new BigInteger("4")).equals(new BigInteger("2"))){
					res=res.xor(i.add(BigInteger.ONE));
				}
				if(i.mod(new BigInteger("4")).equals(new BigInteger("3"))){
					res=res.xor(BigInteger.ZERO);
				}
				
			}
			seq[j]=res.intValue();
			j++;
			t--;
		}
		int k;
		for(k=0;k<seq.length;k++)
			System.out.println(seq[k]);
	}
}
