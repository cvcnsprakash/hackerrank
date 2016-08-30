package com.hackerearth;

import java.util.Scanner;

public class Diagonal {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int a[][] = new int[n][n];
	        int primaryDiagonal =0;
	        int secondaryDiagonal = 0;
	        int v = 0;
	        for(int a_i=0; a_i < n; a_i++){
	            for(int a_j=0; a_j < n; a_j++){
	                a[a_i][a_j] = in.nextInt();
	                if(a_i == a_j){
	                    primaryDiagonal += a[a_i][a_j];
	                }
	                if(a_j == n-a_i-1){
	                    secondaryDiagonal += a[a_i][a_j];
	                }
	                
	                
	            }
	        }
	        System.out.println( Math.abs(secondaryDiagonal-primaryDiagonal )  );
	    }

}
