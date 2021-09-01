package com.javainterviewprograms;

public class Countofoddnumber {

	public static void main(String[] args) {
		// Count of odd number(1 to 100): 
		int count=0;
		for (int i = 1; i <=100; i++) {
			if (i%2==1) {
				count++;
				
			}
			
		}
		System.out.println(count);

	}

}
