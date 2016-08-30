package com.hackerearth;

import java.util.Scanner;

public class CutTheSticks {
	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int length = s.nextInt();
		int array[] = new int[length];
		
		int count = 0;
		int min =Integer.MAX_VALUE;
		for(int a=0;a<length;a++){
			array[a]= s.nextInt();
	    	 if(array[a] < min){
			 min = array[a];
	     	 }
		}
		System.out.println(length);
	while(min!=0){
		int inmin= Integer.MAX_VALUE;
		for(int x=0;x<length;x++){
			if(array[x]!=0){
		 	array[x]-=min;
			}
			 if(array[x] < inmin && array[x]!=0){
				 inmin = array[x];
		     	 }
			if(array[x]!=0){
				count++;
			}
		
		}
	
		if(count==0){
			min=0;
		}else{
			min=inmin;
			System.out.println(count);
		}
	
		count=0;
	}
	}
	
	

}
