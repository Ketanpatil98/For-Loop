

package com.Forloop;

public class Fibonaccidw {
	
	public static void main(String[] args) {
		
		int num = 10;
		int a = 0;
		int b = 1;
		
		do {
			System.out.println(a);
			int n= a+b;
			a=b;
			b=n;
			num --;
		}while(num > 0);
	}

}
