package hr.Strings;
import java.util.Scanner;

public class RepeatedString {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		long n=sc.nextLong();
		String temp=str;
		if((long)str.length()>=n){

//			System.out.println(str);
			System.out.println((long)str.substring(0,(int)n).length()-(long)str.substring(0,(int)n).replace("a","").length());
		}
		else{
			long times=n/(long)str.length();
//			System.out.println(times);
			while((long)str.length()<=n){
				str=new String(new char[(int)times+1]).replace("\0", temp);
			}
//			System.out.println(str);
			System.out.println((long)str.substring(0,(int)n).length()-(long)str.substring(0,(int)n).replace("a","").length());
		}
	}
}
