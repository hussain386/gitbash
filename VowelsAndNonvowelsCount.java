package com.javainterviewprograms;

public class VowelsAndNonvowelsCount {

	public static void main(String[] args) {
		String nam="aq aq aq aq";
		String stringnam = nam.replace(" ", "");
		
		int vowelCount=0,nonVowelCount=0;
		String small = stringnam.toLowerCase();
		for (int i = 0; i <small.length(); i++) {
			char ch = small.charAt(i);
			if (ch=='a' || ch=='e'||ch=='i' || ch=='o'|| ch=='u' ) {
				vowelCount++;
			}else {
				nonVowelCount++;
			}


		}
		System.out.println("vowelCount:"+vowelCount+"\n"+"nonVowelCount:"+nonVowelCount);
		int vowcount=0,nonvowels=0;
		String nam1="aeiou sky";
		String name = nam1.replaceAll(" ", "");
		String rep = name.replaceAll("[AEIOUaeiou]", "*");
		for (int i = 0; i < name.length(); i++) {
			char ch1 = rep.charAt(i);
			if (ch1=='*') {
				vowcount++;
			}else {
				nonvowels++;
			}
		}
		System.out.println("vowels count:"+vowcount);
		System.out.println("nonvowels count:"+nonvowels);

	}

}
