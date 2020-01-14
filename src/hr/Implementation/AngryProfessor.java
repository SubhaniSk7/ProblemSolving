package hr.Implementation;

import java.util.Scanner;

public class AngryProfessor {

	public static void main(String[] args) {
		
        Scanner in = new Scanner(System.in);
        int t = in.nextInt(),i,studentCount,flag;
        
        String[] cancelled=new String[t];
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[n];
            studentCount=0;
            flag=0;
            
            for(i=0; i< n; i++){
                a[i] = in.nextInt();
                
                if(a[i]<=0){
                	studentCount+=1;
                	if(studentCount>=k){
                		flag=1;
                	}
                	else{
                		flag=0;
                	}
                }
            }
            if(flag==1){
            	cancelled[a0]="NO";
            }
            else{
            	cancelled[a0]="YES";
            }
        }
        
        for(i=0;i<cancelled.length;i++)
        	System.out.println(cancelled[i]);
    }
}
