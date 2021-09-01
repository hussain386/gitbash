package com.javainterviewprograms;

public class StringReverse {

	public static void main(String[] args) {

		String name="malayalamq",rev="";
		for (int i =name.length()-1; i >=0; i--) {
			rev=rev+name.charAt(i);
		}
		if (name.equals(rev)) {
			System.out.println("it is palindrome");

		}else
		{
			System.out.println("not palindrome");
		}


	}

}
