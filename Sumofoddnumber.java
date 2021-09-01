package com.javainterviewprograms;

public class Sumofoddnumber {

	public static void main(String[] args) {
		//Sum of odd number(1 to 100): 
		int sum=0;
		for (int i = 1; i <=100; i++) {
			if(i%2==1) {
				sum=sum+i;
			}
			
		}
		System.out.println(sum);
	}

}
