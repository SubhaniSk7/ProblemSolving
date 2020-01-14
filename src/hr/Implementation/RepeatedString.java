package hr.Implementation;
import java.util.Scanner;

public class RepeatedString {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		long n=sc.nextLong();
		String temp=str;
		if((long)str.length()>=n)
			System.out.println((long)str.substring(0,(int)n).length()-(long)str.substring(0,(int)n).replace("a","").length());
		else{
			long times=n/(long)str.length();
			long count=(long)str.length()-(long)str.replace("a","").length();
			if(n%(long)str.length()!=0){
				long remaining=(long)str.substring(0,((int)(n%(long)str.length()))).length()-(long)str.substring(0,((int)(n%(long)str.length()))).replace("a","").length();
				System.out.println(count*times+remaining);
			}
			else
				System.out.println(count*times);
		}
	}
}
