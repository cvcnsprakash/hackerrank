package com.hackerearth;

import java.util.Scanner;

public class FindDigits {
	
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		FindDigits f = new FindDigits();
		
		for(int n=0; n<count ;n++){
			int number = in.nextInt();
			System.out.println(f.recursive(number, number, 0));
			
		 
		 
		
			
		}
		
	}
	
	private int recursive(int in, int number,int count){
		int last = in%10;
		
		
		if(  last!=0 &&number %last ==0 ){
			count ++;
		}
		if((in/10) == 0){
			return count;
			
		}
		
		return recursive( in/10 , number , count);
		
	
		
		
	}

}
