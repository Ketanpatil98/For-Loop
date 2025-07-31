//Factorial of a Number Find the factorial of a given number N using a for loop.


package com.Forloop;

public class Factorial {
	
	public static void main(String[] args) {
		
		int a;
		long Factorial = 1;
		
		for(a = 1; a <= 8; a++) {
			Factorial *=a;
			System.out.println("the factorial of number is " + Factorial);
		}
	}

}
