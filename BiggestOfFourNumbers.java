package com.javainterviewprograms;

public class BiggestOfFourNumbers {

	public static void main(String[] args) {
		int a=100,b=101,c=102,d=10;
		if (a>b&&a>d&&a>c) {
			System.out.println("a is greatest one");
		}
		else if(b>a&&b>c&&b>d){
			System.out.println("b is greatest one");
		}
		else if(d>a&&d>b&&d>c){
			System.out.println("d is greatest one");
		}

		else {
			System.out.println("c is the greatest one");
			

		}

	}

}
