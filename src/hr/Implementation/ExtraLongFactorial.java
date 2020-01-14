package hr.Implementation;

import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorial {
	public static void main(String subhani[]){
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger fact= new BigInteger(""+1);
        while(n>0){
        	fact=fact.multiply(new BigInteger(""+n));
        	n--;
        }
        System.out.println(fact);
	}
}
