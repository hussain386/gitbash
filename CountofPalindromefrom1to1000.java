package com.javainterviewprograms;

public class CountofPalindromefrom1to1000 {
	
	public static void main(String[] args) {
		int count=0;
		for (int i = 1; i <=1000; i++) {
			int rem=0,j=0,a;
			a=i;
			while (a>0) {
				rem=a%10;
				j=(j*10)+rem;
				a=a/10;
				
			}
			if(i==j) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
