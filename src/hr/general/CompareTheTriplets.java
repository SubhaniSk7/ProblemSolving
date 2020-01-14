package hr.general;
import java.util.Scanner;

public class CompareTheTriplets {

	public static void main(String subhani[]){
		
		Scanner in = new Scanner(System.in);
        int a0 = in.nextInt();
        int a1 = in.nextInt();
        int a2 = in.nextInt();
        int b0 = in.nextInt();
        int b1 = in.nextInt();
        int b2 = in.nextInt();
        
        int apoints=0,bpoints=0;
        
        if(a0>b0){
        	apoints+=1;
        }
        else if(a0<b0){
        	bpoints+=1;
        }
        else{
        	
        }
        
        if(a1>b1){
        	apoints+=1;
        }
        else if(a1<b1){
        	bpoints+=1;
        }
        else{
        	
        }
        
        if(a2>b2){
        	apoints+=1;
        }
        else if(a2<b2){
        	bpoints+=1;
        }
        else{
        	
        }
        
        System.out.print(apoints+" "+bpoints);
	}
}
