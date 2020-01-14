package hr.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class StrangeCounter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		// int t = in.nextInt();
		// int i,counter=4,multi=1;
		//
		// for(i=1;i<=t;i++){
		//
		// if(counter==1){
		// multi=multi*2;
		// counter=multi*3;
		// }
		// else
		// counter-=1;
		// // System.out.println(i+":"+counter);
		//
		// }
		// System.out.println(counter);

		BigInteger t = in.nextBigInteger();
		
		BigInteger two = new BigInteger("2");
		BigInteger three = new BigInteger("3");
		BigInteger n=two;
		while (three.multiply(n.subtract(BigInteger.ONE)).compareTo(t) < 0) {
			n=n.multiply(two);
		}
		
		System.out.println(three.multiply(n.subtract(BigInteger.ONE)).subtract(t).add(BigInteger.ONE));
	}
}
