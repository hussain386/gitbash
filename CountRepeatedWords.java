package com.javainterviewprograms;



public class CountRepeatedWords {

	public static void countByAzeez() {

		System.out.println( System.currentTimeMillis());
		String str="he is good he is very bad and he is innocent";
		String[] aa=str.split(" ");
		String response="";
		int count;
		for (String string : aa) {
			count=0;
			for(int i=0;i<aa.length;i++) {
				if(string.equals(aa[i]))
					count++;
			}
			if(!response.contains(string))
				response=response + string + " :- " + count + "\n";
		}
		System.out.println(response);
		System.out.println(System.currentTimeMillis());

	}

	public static void countByHussain() {
		System.out.println( System.currentTimeMillis());
		String str="he is good he is very bad and he is innocent";
		String[] word = str.split(" ");
		int count;
		for (int i = 0; i < word.length; i++) {
			count=1;
			for (int j = i+1; j < word.length; j++) {
				if(word[i].equals(word[j])) {
					count=count+1;
					word[j]="0";
				}

			}
			if(word[i]!="0") {
				System.out.println(word[i]+"   ----->"+count);
			}
		}
		System.out.println( System.currentTimeMillis());
	}
	public static void main(String[] args) {

		countByAzeez();
		countByHussain();
	}

}
