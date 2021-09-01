package com.javainterviewprograms;

import java.util.Scanner;

public class checkpalindromenumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter palindrome num-->");
		int num = sc.nextInt();
		int temp,j=0,i=0;
		temp=num;
		while (num>0) {
			i=num%10;// gives rem
			j=(j*10)+i;
			num=num/10;
		}
		if (temp==j) {
			System.out.println("Number is palindrome");
		} else {
			System.out.println("Not a palindrome");

		}

	}

}
