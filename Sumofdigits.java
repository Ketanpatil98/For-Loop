//Sum of Digits of a Number Find the sum of the digits of a given number using only a for loop.


package com.Forloop;

public class Sumofdigits {
	public static void main(String[] args) {
		
		
		int num = 120;
		int sum = 0;
		
		for (;num>0;num/=10) {
			sum += num %10;
			System.out.println(sum);
		}
		
		
	}

}
