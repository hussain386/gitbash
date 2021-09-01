package com.javainterviewprograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Table number: ");
		int num = sc.nextInt();
		int multiply;
		for (int i = 1; i <=20; i++) {
			multiply=num*i;
			System.out.println(num+"x"+i+"="+multiply);
		}

	}

}
