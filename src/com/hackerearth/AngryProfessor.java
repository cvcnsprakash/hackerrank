package com.hackerearth;

import java.util.Scanner;

public class AngryProfessor {
	
	public static void main(String[] args) {
		       Scanner in = new Scanner(System.in);
		        int t = in.nextInt();
		  
		        for(int a0 = 0; a0 < t; a0++){
		            int n = in.nextInt();
		            int k = in.nextInt();
		            
		            int temp =0;
		            for(int iterator=0 ;iterator<n;iterator++){
		            int 	t1 = in.nextInt();
		            	if(t1<=0){
		            		temp ++;
		            	}
		            }
		            
		            if(temp >=k){
		            	System.out.println("NO");
		            }else{
		            	System.out.println("YES");
		            }
		            
		            
		        
		        }
		    }
}
