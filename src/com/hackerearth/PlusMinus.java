package com.hackerearth;

import java.util.Scanner;

public class PlusMinus {
	
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        int n = in.nextInt();
	        int arr[] = new int[n];
	        double positive =0;
	        double negative = 0;
	        for(int arr_i=0; arr_i < n; arr_i++){
	            arr[arr_i] = in.nextInt();
	            if(arr[arr_i]>0){
	            	positive +=1;
	            }else if(arr[arr_i]<0){
	            	negative +=1;
	            }
	        }
	        System.out.println(positive/n + "\n" + negative/n + "\n" + (n-(positive + negative))/n  );
	    }

}
