package com.javainterviewprograms;

public class PrintPalindromenum {

	public static void main(String[] args) {
		// print palindrome num from 1-100
		int num=100;
		for (int n = 1; n <num; n++) {
			int i=0,j=0,a;
			a=n;
			while (a>0) {
				i=a%10;
				j=(j*10)+i;
				a=a/10;

			}
			if (n==j) {

				System.out.println(n);

			}

		}


	}

}
