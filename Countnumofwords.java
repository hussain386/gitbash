package com.javainterviewprograms;

import java.util.Scanner;

public class Countnumofwords {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("write any words to count num ");
		String str=sc.nextLine();
		int count=1;
		for (int i = 0; i < str.length(); i++) {
			if(str.charAt(i)==' ') {
				count++;
			}
		}
		System.out.println("num of words:"+count);
	}

}
