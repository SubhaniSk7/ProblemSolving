package hr.BitManipulation;

import java.math.BigInteger;
import java.util.Scanner;

public class CounterGame {

	public static void main(String subhani[]) throws InterruptedException {
		Scanner sc = new Scanner(System.in);

		int t = sc.nextInt();
		String[] winner = new String[t];
		BigInteger counter = BigInteger.ZERO;
		BigInteger two = new BigInteger("2");

		BigInteger[] n=new BigInteger[t];
		int flag,k=0,i;
		
		for(i=0;i<t;i++){
			n[i]=sc.nextBigInteger();
		}
		i=0;
		
		BigInteger power;
		while (t > 0) {
			flag = 0;
			counter=BigInteger.ZERO;
			while (n[i].compareTo(BigInteger.ONE) != 0) {
				if (n[i].and(n[i].subtract(BigInteger.ONE)).compareTo(BigInteger.ZERO) ==0) {

					n[i] = n[i].shiftRight(1);

				} else {
					power=two;
					while (true) {
						if(power.compareTo(n[i]) > 0){
							power=power.divide(two);
							break;
						}
						power = power.multiply(two);
					}

					n[i] = n[i].subtract(power);
				}
				if (counter.mod(two).compareTo(BigInteger.ZERO) == 0) {
					flag = 0;
				} else {
					flag = 1;
				}
				counter=counter.add(BigInteger.ONE);
			}

			if (flag == 0) {
				winner[i]="Louise";
			} else {
				winner[i]="Richard";
			}
			i++;
			t--;
		}
		for(i=0;i<winner.length;i++)
			System.out.println(winner[i]);
	}
}
