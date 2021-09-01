package com.javainterviewprograms;

public class Fibonacciseries {

	public static void main(String[] args) {
		//  Fibonacci series
		int a=0,b=1,c=0,count=2;
		System.out.println(a+"\n"+b);
		while (count<10) {
			c=a+b;
			a=b;
			b=c;
			
			count++;
			System.out.println(c);
		}
		

	}

}
