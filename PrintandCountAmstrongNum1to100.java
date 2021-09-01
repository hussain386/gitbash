package com.javainterviewprograms;

public class PrintandCountAmstrongNum1to100 {

	public static void main(String[] args) {

		int num=1000,count=0;
		for (int i = 0; i <num; i++) {
			int fact=0,fact1=0,r,r1,n;
			n=i;
			while (n>0) {
				r1=n%10;
				r=n%10;
				fact=fact+(r*r*r);
				//fact1=fact1+(r1);
				n=n/10;
				
			}
			if (i==fact) {
				count++;
				System.out.println(i);
			}	
//			}else if (i==fact1) {
//				System.out.println(i);
//			}
			
		}
		System.out.println("count of amstrong num from 1 to 1000:"+count);

	}

}
