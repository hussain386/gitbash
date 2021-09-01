package com.javainterviewprograms;

import java.util.Scanner;

public class CheckPrimeNumber {

	public static void main(String[] args) {
		// Any whole number greater than 1 that is divisible
		//only by 1 and itself, is defined as a prime number.
		//task check prime or not
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a prime number:");
		int num = sc.nextInt();
		boolean prime=true;
		for (int j = 2; j <num ; j++) {
			if (num%j==0) {
				prime=false;
			}
		}
		sc.close();
		
			System.out.println("it is Prime number:"+prime);
		
			
			
		
		
	}
}
