package com.javainterviewprograms;

public class AmstrongNum {

	public static void main(String[] args) {
		//amstrong numbers:1, 2, 3, 4, 5, 6, 7, 8, 9, 153, 370, 371, 407, 1634, 8208, 9474, 54748
		int num=8208,r,q,fact=0,temp;
		temp=num;
		while (num>0) {
			r=num%10;
			num=num/10;
			fact=fact+(r*r*r*r);
		}
		if (temp==fact) {
			System.out.println("it is amstrong");
		} else {
			System.out.println("not a amstrong");

		}
		

	}

}
