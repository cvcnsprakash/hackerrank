package com.hackerearth;

import java.util.Scanner;

public class TimeConversion {
	
	  public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        String time = in.next();
	        
	        int index = time.indexOf(":");
	   
	        int frstTwo = Integer.parseInt(time.substring(0, index));
	        String lastTwo = time.substring(time.length()-2,time.length()).toUpperCase();
	        
	        if("PM".equals(lastTwo)){
	        	if(frstTwo!=12){
	        		frstTwo +=12;
	        	}
	        }else if("AM".equals(lastTwo)){
	        	if(frstTwo==12){
	        	frstTwo -=12;
	        	}
	        }
	        if(frstTwo<10){
	            System.out.println("0"+frstTwo  +time.substring(2,time.length()-2));
	        }else{
	            System.out.println(frstTwo  +time.substring(2,time.length()-2));
	        }
	  
	        
	    }

}
