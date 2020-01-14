package hr.Strings;
import java.util.Scanner;

public class SuperReducedString {

	public static void main(String subhani[]){
		
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		String substr;
		int i,j;
		for(i=0;i<str.length()-1;){
			if(str.charAt(i)==str.charAt(i+1))
			{
				substr=str.substring(i,i+2);
				str=str.replace(substr,"");
				i=0;
			}
			else{
				i++;
			}
		}
		if(str.equals(""))
			System.out.println("Empty String");
		else
			System.out.println(str);
	}
}
