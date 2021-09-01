package com.javainterviewprograms;

import java.util.Scanner;

public class ReverseTheNumber {

	public static void main(String[] args) {
		int n=853,c=0,j=0;
		while (n>0) {
			c=n%10;
			j=(j*10)+c;//1->j=3,2->j=35,3->j=358     iteration-->3
			n=n/10;
			
		}
		  System.out.println("Reverse number is=" + j); 
		
			
		}

	}



