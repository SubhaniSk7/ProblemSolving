package hr.Implementation;
import java.util.Scanner;
public class TimeInWords {

	public static void main(String subhani[]){
		Scanner sc=new Scanner(System.in);
		String[] word={"zero","one","two","three","four","five","six","seven","eight","nine","ten","eleven",
				"twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen","nineteen",
				"twenty","thirty","fourty","fifty"};
		int h=sc.nextInt();
		int m=sc.nextInt();
		if(m>0 && m<=30){
			
		}
		else if(m>30 && m<=59){
			int r=60-m;
			if(r/10==2)
				System.out.println(word[21]);
			else if(r/10==1)
				System.out.println(word[21]);
			else if(r/10==2)
				System.out.println(word[21]);
		}
		
	}
}
