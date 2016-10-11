package com.hackerearth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class Operators {
	
	public static void main(String[] args) throws IOException {
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		Input i = new Input(r);
		double baseDollar = i.nextDouble();
		double  percent = i.nextDouble();
		double  tax = i.nextDouble();
		
	//	(baseDollar +  (baseDollar*(percent/100)) + baseDollar*(tax/100)).
		
	//	double v = 	(baseDollar +  (baseDollar*(percent/100)) + baseDollar*(tax/100));
	//	double  a = (percent/100);
	//	double b = (tax/100);
	//	System.out.println("The total meal cost is " + 	(baseDollar +  (baseDollar*(percent/100)) + baseDollar*(tax/100))   +" dollars." );
		System.out.println("The total meal cost is " + Math.round(baseDollar +  (baseDollar*Double.valueOf(percent/100)) + baseDollar*Double.valueOf(tax/100))   +" dollars." );
		
	}
	

	
	static class Input{
		BufferedReader in;
		StringBuilder sb = new StringBuilder();
		
		public Input(BufferedReader in){
			this.in = in;
		}
		
		public Input(String s){
			this.in = new BufferedReader(new StringReader(s));
		}
		
		
		public String next() throws IOException{
			sb.setLength(0);
			
			while(true){
				int a = in.read();
				if(a== -1){
					return null;
				}
			
				if("\n\r\t".indexOf(a) == -1){
					sb.append((char)a);
					break;
				}
			}
				
				while(true){
					int a = in.read();
					if(a==-1 || "\n\r\t".indexOf(a) != -1){
						break;
				}
					sb.append((char)a);
			}
				return sb.toString();
		}
		
	    public int nextInt() throws IOException {
            return Integer.parseInt(next());
        }

        public long nextLong() throws IOException {
            return Long.parseLong(next());
        }

        public double nextDouble() throws IOException {
            return Double.parseDouble(next());
        }
		
		
		
	}


}

