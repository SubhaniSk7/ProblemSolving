package hr.general;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class FibonacciModified {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		
		ArrayList<BigDecimal> fib=new ArrayList<BigDecimal>();
		
		BigDecimal t0=sc.nextBigDecimal(),t1=sc.nextBigDecimal();
		int n=sc.nextInt();
		fib.add(t0);
		fib.add(t1);
		
		for(int i=0;i<n-2;i++){
			fib.add(fib.get(i).add(fib.get(i+1).pow(2)));
		}
		
		System.out.println(fib.get(n-1));
	}
}
