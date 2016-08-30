package com.hackerearth;

import java.util.Scanner;

public class SaveThePrisoner {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	    int no = in.nextInt();
	    		
	    		for(int a =0 ; a<no;a++){
	    			int p = in.nextInt();
	    			int q = in.nextInt();
	    			int r  = in.nextInt();
	    			int result =0;
	    			
	    			if(q>p){
	    				q = q%p;
	    			}
	    		if(  ((r-1) + q)   >p){
	    			result = 	 ((r-1) + q) % p;
	    		}else{
	    			result = 	 (r-1) + q;
	    		}
	    			System.out.println(result);
	    		
	    			
	    			
	    			
	    		}
	
	}

}
