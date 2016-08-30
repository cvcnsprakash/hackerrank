package com.hackerearth;

import java.util.Scanner;

public class Heap {
	
	 public static void main(String[] args) {
			Scanner s  = new Scanner(System.in);
			int count = s.nextInt();	
		
			//Print n-1 Spaces First
			 
			for(int a=0;a<count;a++){
					
					for(int b=0;b<count-a-1;b++){
						System.out.print(" ");
						continue;
					}
					
					for(int c=count;c>count-a-1;c--){
						System.out.print("#");
						continue;
					}
				
				System.out.print("\n");
				
			}
			
			
		}

}
