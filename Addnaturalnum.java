//Sum of First N Natural Numbers Calculate and print the sum of the first N natural numbers using a for loop.

package com.Forloop;

public class Addnaturalnum {
	public static void main(String[] args) {

		int  n;
		int sum = 0;

		for ( n = 1; n <= 10; n++) {
			sum += n;
			System.out.println("Sum of " + n + "  natural numbers " + sum);

		}
	}

}
